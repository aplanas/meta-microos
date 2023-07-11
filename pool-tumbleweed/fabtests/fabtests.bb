SUMMARY = "Test suite for libfabric API"
DESCRIPTION = "Fabtests provides a set of examples that uses libfabric, a fabric software library."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "1.18.1"

RPM_NAME = "fabtests-1.18.1-1.1.aarch64.rpm"
RPM_HASH = "3f0b5f274052ae9e75baea10beb0d73a83b3f0d8e9941e5f51c12c809c411386a8e08f1b83080fa109808435a236c8e427b2ae8a656d952442ff888dbffd375f"

RPROVIDES:${PN} += "fabtests"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfabric.so.1"

inherit rpm
