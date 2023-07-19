SUMMARY = "Upload server for the data fetching service"
DESCRIPTION = "Upload server for the data fetching service for VM container images"
LICENSE = "Apache-2.0"

PV = "1.56.0"

RPM_NAME = "containerized-data-importer-uploadserver-1.56.0-2.1.aarch64.rpm"
RPM_HASH = "43d98cd3c0f8437b6a549cb1d99f9b08bd9ebd85ec94cb18230a301040e394313197bd0d5328c70091ee5ca86bbedb18beafe7a4019228691d12d0c9f5f021d7"

RPROVIDES:${PN} += "containerized-data-importer-uploadserver"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
