SUMMARY = "International Components for Unicode"
DESCRIPTION = "ICU is a set of C and C++ libraries that provide extensive Unicode \
and locale support. \
This package contains the runtime libraries for ICU."
LICENSE = "ICU"

PV = "73.2"

RPM_NAME = "libicu73-73.2-1.1.aarch64.rpm"
RPM_HASH = "d60374e93848cfe24692bc209ba305c25532ebe39a93d57fd917a7b21548fc1dc7a13e01653db806cf1344eeaedf197948f86c0682a19372aa8b30a7f1f8d6a2"

RPROVIDES:${PN} += "libicu \
libicu73 \
libicudata.so.73 \
libicui18n.so.73 \
libicuio.so.73 \
libicutest.so.73 \
libicutu.so.73 \
libicuuc.so.73"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libicu73-ledata \
libm.so.6 \
libstdc++.so.6 \
timezone"

inherit rpm
