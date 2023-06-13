SUMMARY = "An implementation of the Unicode BiDi algorithm"
DESCRIPTION = "This library implements the algorithm as described in 'Unicode \
Standard Annex #9, the Bidirectional Algorithm'."
LICENSE = "LGPL-2.1-only"

PV = "1.0.12"

RPM_NAME = "fribidi-1.0.12-1.6.aarch64.rpm"
RPM_HASH = "43fdeac3e13d28a81b30d1988482ff747373be072510f6a3fb55e18dfba4eb6bd5273f891bc8d5af139bb8dd83474aa178c01d50f24b0fdd0816c2d66e208236"

RPROVIDES:${PN} += "fribidi \
fribidi(aarch-64) \
locale(ar;he)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfribidi.so.0()(64bit)"

inherit rpm
