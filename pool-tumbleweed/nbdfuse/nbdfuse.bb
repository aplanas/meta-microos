SUMMARY = "FUSE support for libnbd"
DESCRIPTION = "This package contains FUSE support for libnbd."
LICENSE = "LGPL-2.1-or-later"

PV = "1.14.1"

RPM_NAME = "nbdfuse-1.14.1-2.2.aarch64.rpm"
RPM_HASH = "6a91f2f955d98cf4ca711917fbcc933a0ec3d51940dfe7dde5cf1798825728da5114a73ebdc3599adb296a7e1e3333db19466eaeb9af60ea69bd4a67bff9cb91"

RPROVIDES:${PN} += "nbdfuse"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse3.so.3 \
libnbd.so.0 \
libnbd0"

inherit rpm
