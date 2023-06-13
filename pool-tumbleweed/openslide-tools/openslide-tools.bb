SUMMARY = "Command line tools for openslide"
DESCRIPTION = "This package contains command line tools for working with virtual slides."
LICENSE = "LGPL-2.1-only"

PV = "3.4.1"

RPM_NAME = "openslide-tools-3.4.1-2.25.aarch64.rpm"
RPM_HASH = "c3a3e84e5d4bf36ce3180608887d53ef17ec3755e37d3e7423766a38f8f3de6928cd008f635b4a53e4f76da202b0c7c9d7b7d70e684ed263215645984673ac19"

RPROVIDES:${PN} += "openslide-tools \
openslide-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libglib-2.0.so.0()(64bit) \
libopenslide.so.0()(64bit) \
libopenslide0 \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit)"

inherit rpm
