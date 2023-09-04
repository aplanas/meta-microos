SUMMARY = "Controller for the data fetching service"
DESCRIPTION = "Controller for the data fetching service for VM container images"
LICENSE = "Apache-2.0"

PV = "1.57.0"

RPM_NAME = "containerized-data-importer-controller-1.57.0-1.1.aarch64.rpm"
RPM_HASH = "6c26e26ca08bd48a39027507c931c115e504f0b7cb44de1096205d489895693201c53dccb2d6450ed42590e14b74d63317b79394d7a9ccf9a0dbd92ea12f58f9"

RPROVIDES:${PN} += "containerized-data-importer-controller"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
