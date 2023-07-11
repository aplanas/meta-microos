SUMMARY = "YAML manifests used to install CDI"
DESCRIPTION = "This contains the built YAML manifests used to install CDI into a \
kubernetes installation with kubectl apply."
LICENSE = "Apache-2.0"

PV = "1.56.0"

RPM_NAME = "containerized-data-importer-manifests-1.56.0-1.5.aarch64.rpm"
RPM_HASH = "1049d816795ada30936e3a215df5fe0416a17e9c3ec878ccc68ecbd3408b504c1871f98ba541a2757d1e6d31f1fb4e076621d6295528e4e2be3efca1a9e5cde6"

RPROVIDES:${PN} += "containerized-data-importer-manifests"

RDEPENDS:${PN} += ""

inherit rpm
