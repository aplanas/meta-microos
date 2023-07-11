SUMMARY = "Internal tests for robinhood"
DESCRIPTION = "Tests and examples for the robinhood policy engine."
LICENSE = "CECILL-C"

PV = "3.1.7"

RPM_NAME = "robinhood-tests-3.1.7-2.2.aarch64.rpm"
RPM_HASH = "2d881d06697ec7007c66c502ec2c39ee151baf31aed4a251345d3a3d252608d7c875109633d0f0ee43cbf711a9739c1e8732fa816d051b5258bb9fd6d512e5ba"

RPROVIDES:${PN} += "robinhood-tests"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0"

inherit rpm
