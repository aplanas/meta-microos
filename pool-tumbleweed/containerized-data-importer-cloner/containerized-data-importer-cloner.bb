SUMMARY = "Cloner for host assisted cloning"
DESCRIPTION = "Source and Target cloner image for host assisted cloning"
LICENSE = "Apache-2.0"

PV = "1.57.0"

RPM_NAME = "containerized-data-importer-cloner-1.57.0-1.1.aarch64.rpm"
RPM_HASH = "77bf9b4146170d55720371635a36d7ee07a4be77ea94ac5bd3ebff9ccbc81d6102b89dccb813ae48e0f9720a38d702889a0bea30fdcf9e1f3866448e7dd2c2b2"

RPROVIDES:${PN} += "containerized-data-importer-cloner"

RDEPENDS:${PN} += "/usr/bin/bash \
libc.so.6"

inherit rpm
