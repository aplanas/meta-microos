SUMMARY = "Upload server for the data fetching service"
DESCRIPTION = "Upload server for the data fetching service for VM container images"
LICENSE = "Apache-2.0"

PV = "1.57.0"

RPM_NAME = "containerized-data-importer-uploadserver-1.57.0-1.1.aarch64.rpm"
RPM_HASH = "c2db849c7c42b884b3b3e3ca821886352a124c4a9ad99503805ef2ed24113b602b2e83d6bd355936512dbbc198c0ee5bd4c396c14f66de0dbc8e30e454b25f50"

RPROVIDES:${PN} += "containerized-data-importer-uploadserver"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
