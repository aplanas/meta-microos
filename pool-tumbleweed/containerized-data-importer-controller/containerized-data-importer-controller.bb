SUMMARY = "Controller for the data fetching service"
DESCRIPTION = "Controller for the data fetching service for VM container images"
LICENSE = "Apache-2.0"

PV = "1.56.0"

RPM_NAME = "containerized-data-importer-controller-1.56.0-1.5.aarch64.rpm"
RPM_HASH = "1b52ec390bbb0d4b55bddd466f72e6a40c11ea02bbf7973dab4d261be73006597cee258c7d2b53cae618edcc41ed50e31d6e20cd984ff13fd7669643f435a53d"

RPROVIDES:${PN} += "containerized-data-importer-controller"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
