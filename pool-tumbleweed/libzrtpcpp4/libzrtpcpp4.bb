SUMMARY = "A ccrtp extension for ZRTP support"
DESCRIPTION = "A library that adds RFC6189-compliant ZRTP support to the GNU ccRTP \
stack and serves as library for other RTP stacks such as PJSIP and \
GStreamer. ZRTP was developed to allow ad-hoc key negotiation to \
setup Secure RTP (SRTP) sessions."
LICENSE = "GPL-3.0-or-later"

PV = "4.7.0"

RPM_NAME = "libzrtpcpp4-4.7.0-1.11.aarch64.rpm"
RPM_HASH = "66d06248edd8d3c2ea9d8b3aef5964e7addfc0a234a249afd545f83d44566946544c7c6d2ffad8a9ef3a45c7e181512afff784f182f82e3ff40ae397ccbe560b"

RPROVIDES:${PN} += "libzrtpcpp.so.4 \
libzrtpcpp4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libccrtp.so.3 \
libcommoncpp.so.8 \
libcrypto.so.1.0.0 \
libgcc-s.so.1 \
libstdc++.so.6 \
libucommon.so.8"

inherit rpm
