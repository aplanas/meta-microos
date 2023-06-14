SUMMARY = "Open Phone Abstraction Library"
DESCRIPTION = "Open Phone Abstraction Library, implementation of the ITU H.323 \
teleconferencing protocol, and successor of the openh323 library. It \
supports the H.323 protocol as well as SIP and IAX2."
LICENSE = "MPL-1.0"

PV = "3.18.8"

RPM_NAME = "libopal3_18_8-3.18.8-2.9.aarch64.rpm"
RPM_HASH = "2847e5055dc93fbec60a1a4f911912a28f3c521bd63a6d1a32d43b75f4417fabad65d2e6febdef5c1ff60231aeb36cc3941198d7d614706a94986e3c2acbbee1"

RPROVIDES:${PN} += "libopal.so.3.18.8 \
libopal3-18-8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopus.so.0 \
libpt.so.2.18.8 \
libspandsp.so.3 \
libspeex.so.1 \
libspeexdsp.so.1 \
libsrtp2.so.1 \
libstdc++.so.6 \
libtheora.so.0"

inherit rpm
