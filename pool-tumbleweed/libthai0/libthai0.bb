SUMMARY = "Thai Language Support Routines"
DESCRIPTION = "LibThai is a set of Thai language support routines to aid \
incorporation of Thai language support into applications. It includes \
important Thai-specific functions, such as word breaking, input and \
output methods, and basic character and string support."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.29"

RPM_NAME = "libthai0-0.1.29-1.6.aarch64.rpm"
RPM_HASH = "969f9c5c31e9f069088a7abef31d93411df5b9a5775b5d6809a31b1602134ecd06ebb2c76fc5a4d0ac691dc99a4a7038c85e2d9c990c1685c0fce004acfaebe0"

RPROVIDES:${PN} += "libthai \
libthai.so.0 \
libthai0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdatrie.so.1 \
libthai-data"

inherit rpm
