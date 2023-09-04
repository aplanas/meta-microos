SUMMARY = "International Components for Unicode"
DESCRIPTION = "ICU is a set of C and C++ libraries that provide extensive Unicode \
and locale support. \
This package contains the runtime libraries for ICU."
LICENSE = "ICU"

PV = "73.2"

RPM_NAME = "libicu73-73.2-2.1.aarch64.rpm"
RPM_HASH = "547188434f112ccb99e15709fe35b7529fb3f6497a0783cf7a6ce0cd84bc92b66cbac5fbd8612ed0809d09edc92501d01b75d5067ac2a2426f550b23d79a0e6e"

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
