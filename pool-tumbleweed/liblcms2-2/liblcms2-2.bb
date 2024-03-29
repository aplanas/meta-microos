SUMMARY = "Libraries for the Little CMS Engine"
DESCRIPTION = "Little CMS Engine - A color management library and tools."
LICENSE = "MIT"

PV = "2.15"

RPM_NAME = "liblcms2-2-2.15-1.1.aarch64.rpm"
RPM_HASH = "b6c4c614813c8a2afef4f4970ab00813a36ab9303f88c55c2c84390902739744465b2da67aad3f68f16a686f77a6d8d293065fb469d58c8b71aef9d2b0ed2c16"

RPROVIDES:${PN} += "liblcms2-2 \
liblcms2.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
