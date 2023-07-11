SUMMARY = "Web Phone C++ library"
DESCRIPTION = "Linphone is a Web phone with a Qt interface. It lets you make \
two-party calls over IP networks such as the Internet. It uses the IETF \
protocols SIP (Session Initiation Protocol) and RTP (Realtime TransporT \
Protocol) to make calls, so it should be able to communicate with other \
SIP-based Web phones. With several codecs available, it can be used \
with high speed connections as well as 28k modems. \
 \
This package contains a C++ library."
LICENSE = "AGPL-3.0-or-later"

PV = "5.2.50"

RPM_NAME = "liblinphone++10-5.2.50-1.3.aarch64.rpm"
RPM_HASH = "879c26204e62967d2ce00d5fb3f73b07f762009a4146fe4d2fc976081a6146418ae68ef9c97dc25a486753a586e89060dccf24f6cdb8c6dfc2f961fd7b77cfe7"

RPROVIDES:${PN} += "liblinphone++.so.10 \
liblinphone++10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbctoolbox.so.1 \
libbellesip.so.1 \
libc.so.6 \
libgcc-s.so.1 \
liblime.so.0 \
liblinphone.so.10 \
libm.so.6 \
libmediastreamer.so.11 \
libortp.so.15 \
libstdc++.so.6"

inherit rpm
