SUMMARY = "CDI API server"
DESCRIPTION = "The containerized-data-importer-api package provides the kubernetes API extension for CDI"
LICENSE = "Apache-2.0"

PV = "1.56.0"

RPM_NAME = "containerized-data-importer-api-1.56.0-1.3.aarch64.rpm"
RPM_HASH = "b95791156590b9fc443b2d281b6d51b5e47c2ed85ae976bf5ebe6f290ee993d43d312a95e25af3a186abb8c8c762bbd4337259f650b5cfd86eae8ad95c239b97"

RPROVIDES:${PN} += "containerized-data-importer-api containerized-data-importer-api(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
