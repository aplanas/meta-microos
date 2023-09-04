SUMMARY = "Library for real-time communications with async IO support"
DESCRIPTION = "Libre is a library for real-time communications \
with async I/O support and a complete SIP stack with support for protocols \
such as SDP, RTP/RTCP, STUN/TURN/ICE, BFCP, HTTP and DNS Client."
LICENSE = "BSD-3-Clause"

PV = "3.3.0"

RPM_NAME = "libre16-3.3.0-1.1.aarch64.rpm"
RPM_HASH = "72fcf8fc8e94120710d2eb0a58bd639d1729a19acf40d9ded98a412ccd35b91f0516209a5da46c14c6077b55e18352339cb8397ec7068bd2980016fd0537ddcc"

RPROVIDES:${PN} += "libre.so.16 \
libre16"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libm.so.6 \
libssl.so.3 \
libz.so.1"

inherit rpm
