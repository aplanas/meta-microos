SUMMARY = "Library for real-time communications with async IO support"
DESCRIPTION = "Libre is a library for real-time communications \
with async I/O support and a complete SIP stack with support for protocols \
such as SDP, RTP/RTCP, STUN/TURN/ICE, BFCP, HTTP and DNS Client."
LICENSE = "BSD-3-Clause"

PV = "2.10.0"

RPM_NAME = "libre12-2.10.0-1.5.aarch64.rpm"
RPM_HASH = "f7f76deca4758d5809e7ca0bf2b02233d0f162aa11e53fbe7fd6c9eb3384351643396da72cc09a93470c328f33937b3ca846bc8eda80ce7473344e24d7ddef1e"

RPROVIDES:${PN} += "libre.so.12 \
libre12"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
libz.so.1"

inherit rpm
