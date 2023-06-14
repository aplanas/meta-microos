SUMMARY = "FUSE support for libnbd"
DESCRIPTION = "This package contains FUSE support for libnbd."
LICENSE = "LGPL-2.1-or-later"

PV = "1.14.1"

RPM_NAME = "nbdfuse-1.14.1-2.1.aarch64.rpm"
RPM_HASH = "0e798ac94f05d25cb5bcace3a6d37559a47dea620234eb76194688076ad8b3c1ecdc9d6c3007f2194daa1d00b4fb302b29ec382cc49ba99723c211dea0ba2e2a"

RPROVIDES:${PN} += "nbdfuse"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse3.so.3 \
libnbd.so.0 \
libnbd0"

inherit rpm
