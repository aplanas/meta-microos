SUMMARY = "Controller for the data fetching service"
DESCRIPTION = "Controller for the data fetching service for VM container images"
LICENSE = "Apache-2.0"

PV = "1.56.0"

RPM_NAME = "containerized-data-importer-controller-1.56.0-1.4.aarch64.rpm"
RPM_HASH = "35e197281e1762def5deacad27e2cb0c3019f13337e5f5f9970c374ab4b37cb111fd62b015244d4a6420a1d4fcaf9534f9867b145cabc779d5b285d256500f0b"

RPROVIDES:${PN} += "containerized-data-importer-controller \
containerized-data-importer-controller(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit)"

inherit rpm
