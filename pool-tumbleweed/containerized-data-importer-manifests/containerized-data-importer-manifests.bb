SUMMARY = "YAML manifests used to install CDI"
DESCRIPTION = "This contains the built YAML manifests used to install CDI into a \
kubernetes installation with kubectl apply."
LICENSE = "Apache-2.0"

PV = "1.56.0"

RPM_NAME = "containerized-data-importer-manifests-1.56.0-1.4.aarch64.rpm"
RPM_HASH = "d9363b672b301e1535b0b221879bdb2f500c5034943112d76022d8841f02b7f624f202ff5e489cdf237673cb3d0f95232a3c95005af84b03482f344dfcc06f59"

RPROVIDES:${PN} += "containerized-data-importer-manifests \
containerized-data-importer-manifests(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
