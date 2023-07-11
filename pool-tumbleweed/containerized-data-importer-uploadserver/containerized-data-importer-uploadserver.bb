SUMMARY = "Upload server for the data fetching service"
DESCRIPTION = "Upload server for the data fetching service for VM container images"
LICENSE = "Apache-2.0"

PV = "1.56.0"

RPM_NAME = "containerized-data-importer-uploadserver-1.56.0-1.5.aarch64.rpm"
RPM_HASH = "cc67e16d64f171e3f6b36d63c9377e87e22cb8e3da0f36d726ec8058feed55910c598a538c7e508c6ec8d86684aad8f7ee553a3ff9281d8f3e14fa6f1121a113"

RPROVIDES:${PN} += "containerized-data-importer-uploadserver"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
