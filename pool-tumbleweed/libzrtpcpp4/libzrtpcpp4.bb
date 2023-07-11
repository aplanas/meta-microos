SUMMARY = "A ccrtp extension for ZRTP support"
DESCRIPTION = "A library that adds RFC6189-compliant ZRTP support to the GNU ccRTP \
stack and serves as library for other RTP stacks such as PJSIP and \
GStreamer. ZRTP was developed to allow ad-hoc key negotiation to \
setup Secure RTP (SRTP) sessions."
LICENSE = "GPL-3.0-or-later"

PV = "4.7.0"

RPM_NAME = "libzrtpcpp4-4.7.0-1.12.aarch64.rpm"
RPM_HASH = "65b00593f13bbffb88f50d17085c9e48376c85d3ef4b0c17aa8132dbb6c5f36335d337691a1ff35d4cab1127f3567a11f54d1d83930c40443b8aa9a90077a619"

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
