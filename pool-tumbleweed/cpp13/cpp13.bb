SUMMARY = "The GCC Preprocessor"
DESCRIPTION = "This Package contains just the preprocessor that is used by the X11 \
packages."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "cpp13-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "0d78e0caa10bfb3a9f8fcc36dc9501ab9a3164ad429b1b2a9501a88432e220c6acf84c3a33bb4dfd8eb23970f483e41e070459c8c3b290cd9a626be15113beb9"

RPROVIDES:${PN} += "cpp13 \
cpp13(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.36)(64bit) \
libgmp.so.10()(64bit) \
libisl.so.23()(64bit) \
libmpc.so.3()(64bit) \
libmpfr.so.6()(64bit) \
libz.so.1()(64bit) \
libzstd.so.1()(64bit)"

inherit rpm
