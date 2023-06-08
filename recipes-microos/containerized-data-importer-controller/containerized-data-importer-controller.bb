SUMMARY = "Controller for the data fetching service"
DESCRIPTION = "Controller for the data fetching service for VM container images"
LICENSE = "Apache-2.0"

PV = "1.56.0"

RPM_NAME = "containerized-data-importer-controller-1.56.0-1.3.aarch64.rpm"
RPM_HASH = "80bdb65b73efd816d9e42d9b8096b6d659f95554c179ab25a31f01b75e4b81e7cfe0203a4883fe12cc67486e6740ab339a706af14c2d62758a71b3373f60b5cc"

RPROVIDES:${PN} += "containerized-data-importer-controller containerized-data-importer-controller(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
