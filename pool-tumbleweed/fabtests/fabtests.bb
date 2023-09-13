SUMMARY = "Test suite for libfabric API"
DESCRIPTION = "Fabtests provides a set of examples that uses libfabric, a fabric software library."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "1.19.0"

RPM_NAME = "fabtests-1.19.0-1.1.aarch64.rpm"
RPM_HASH = "ce3d9541e9cb85a304ae866a3eaeec02886f9df179ab9d068258a00d948be5c1eaf65b8bb727a2ae7d6cc178309e7582226b11afbaa7bd2fd69cb6ac0534a15a"

RPROVIDES:${PN} += "fabtests"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfabric.so.1"

inherit rpm
