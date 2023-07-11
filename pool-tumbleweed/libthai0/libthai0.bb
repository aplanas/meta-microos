SUMMARY = "Thai Language Support Routines"
DESCRIPTION = "LibThai is a set of Thai language support routines to aid \
incorporation of Thai language support into applications. It includes \
important Thai-specific functions, such as word breaking, input and \
output methods, and basic character and string support."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.29"

RPM_NAME = "libthai0-0.1.29-1.7.aarch64.rpm"
RPM_HASH = "1e03b74d2bc2e00395c1d3b1e943860e625e3974807dbc5da2aa64ba5ce321b1e5d5df3e0f8c3e66471ff333b9c9e7347d44d2af33d2791345676b86e9d3f19f"

RPROVIDES:${PN} += "libthai \
libthai.so.0 \
libthai0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdatrie.so.1 \
libthai-data"

inherit rpm
