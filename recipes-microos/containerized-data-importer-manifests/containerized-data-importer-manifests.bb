SUMMARY = "YAML manifests used to install CDI"
DESCRIPTION = "This contains the built YAML manifests used to install CDI into a \
kubernetes installation with kubectl apply."
LICENSE = "Apache-2.0"

PV = "1.56.0"

RPM_NAME = "containerized-data-importer-manifests-1.56.0-1.3.aarch64.rpm"
RPM_HASH = "82081cb9c89cccd910a1bbee220a91d7bb4acd93912026508f4e438e885b5e1ac13f1b2df2e05b3d79a8990725ec6806a887901c4387622d138eaad21fdc39f6"

RPROVIDES:${PN} += "containerized-data-importer-manifests containerized-data-importer-manifests(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
