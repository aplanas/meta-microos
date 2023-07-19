SUMMARY = "Controller for the data fetching service"
DESCRIPTION = "Controller for the data fetching service for VM container images"
LICENSE = "Apache-2.0"

PV = "1.56.0"

RPM_NAME = "containerized-data-importer-controller-1.56.0-2.1.aarch64.rpm"
RPM_HASH = "c69a38016f667fb6c8298ac8272a19a1118120b9498f46ddc09b1c37d679dbea96f76f47f39a26fb4d31e5a191048cb4841ef8771b9471d887517a0c1842e762"

RPROVIDES:${PN} += "containerized-data-importer-controller"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
