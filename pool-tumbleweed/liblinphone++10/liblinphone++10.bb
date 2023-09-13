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

PV = "5.2.98"

RPM_NAME = "liblinphone++10-5.2.98-2.1.aarch64.rpm"
RPM_HASH = "63c432c8e83bba5e9c6c1bb6a84f1e821b2c16dc63293e657aff824e9a355a58eaffe7d7b85346f8d54c1255faee95aedf56d34c5c3af4051cee0e3142f090c9"

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
