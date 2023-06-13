SUMMARY = "Open Phone Abstraction Library"
DESCRIPTION = "Open Phone Abstraction Library, implementation of the ITU H.323 \
teleconferencing protocol, and successor of the openh323 library. It \
supports the H.323 protocol as well as SIP and IAX2."
LICENSE = "MPL-1.0"

PV = "3.18.8"

RPM_NAME = "libopal3_18_8-3.18.8-2.9.aarch64.rpm"
RPM_HASH = "2847e5055dc93fbec60a1a4f911912a28f3c521bd63a6d1a32d43b75f4417fabad65d2e6febdef5c1ff60231aeb36cc3941198d7d614706a94986e3c2acbbee1"

RPROVIDES:${PN} += "libopal.so.3.18.8()(64bit) \
libopal3_18_8 \
libopal3_18_8(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libopus.so.0()(64bit) \
libpt.so.2.18.8()(64bit) \
libspandsp.so.3()(64bit) \
libspeex.so.1()(64bit) \
libspeexdsp.so.1()(64bit) \
libsrtp2.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libtheora.so.0()(64bit)"

inherit rpm
