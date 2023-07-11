SUMMARY = "Operator for the data fetching service"
DESCRIPTION = "Operator for the data fetching service for VM container images"
LICENSE = "Apache-2.0"

PV = "1.56.0"

RPM_NAME = "containerized-data-importer-operator-1.56.0-1.5.aarch64.rpm"
RPM_HASH = "f257b8850665c7e48ae0a6e549d34eb9dc3b003aa50835ca63c370e667c220c3e06da0648d7624b810a686b434e66bb3ac63a28a20cd20f06529cbb84d4f0806"

RPROVIDES:${PN} += "containerized-data-importer-operator"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
