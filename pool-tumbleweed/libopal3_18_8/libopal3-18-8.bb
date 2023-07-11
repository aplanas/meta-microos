SUMMARY = "Open Phone Abstraction Library"
DESCRIPTION = "Open Phone Abstraction Library, implementation of the ITU H.323 \
teleconferencing protocol, and successor of the openh323 library. It \
supports the H.323 protocol as well as SIP and IAX2."
LICENSE = "MPL-1.0"

PV = "3.18.8"

RPM_NAME = "libopal3_18_8-3.18.8-2.10.aarch64.rpm"
RPM_HASH = "60dcf7dd82420b385c440d5ebaefc5eb5f557ea79607f80dac53270916b89d033b0c01dda9d2b92fd9eedc271205072aa1a0ee3560dbb899c7cc559a6e971515"

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
