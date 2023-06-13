SUMMARY = "VisualOn AMR-WB encoder library"
DESCRIPTION = "This library contains an encoder implementation of the Adaptive \
Multi Rate Wideband (AMR-WB) audio codec. The library is based \
on a codec implementation by VisualOn as part of the Stagefright \
framework from the Google Android project."
LICENSE = "Apache-2.0"

PV = "0.1.3+5"

RPM_NAME = "libvo-amrwbenc0-0.1.3+5-1.1.aarch64.rpm"
RPM_HASH = "bac2a74b3d111e0cf32985a248f791a47cb87f2831c0a7a110ac3b444b705364c218c97420fa64870624297f0f0faa31bdc797dea78be84b746a6da7ad31c1d4"

RPROVIDES:${PN} += "libvo-amrwbenc.so.0()(64bit) \
libvo-amrwbenc0 \
libvo-amrwbenc0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
