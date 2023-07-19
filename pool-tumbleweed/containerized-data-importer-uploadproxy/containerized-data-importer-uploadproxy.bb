SUMMARY = "Upload proxy for the data fetching service"
DESCRIPTION = "Upload proxy for the data fetching service for VM container images"
LICENSE = "Apache-2.0"

PV = "1.56.0"

RPM_NAME = "containerized-data-importer-uploadproxy-1.56.0-2.1.aarch64.rpm"
RPM_HASH = "4222da002a988c0674199c5de5f3b5373b9d80ac854a793549c4435505ac29714299454d02d4299d1428441f4d8291675f4ca3bf92b8efa4f35733dd4667ce12"

RPROVIDES:${PN} += "containerized-data-importer-uploadproxy"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
