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

RPM_NAME = "liblinphone++10-5.2.50-1.1.aarch64.rpm"
RPM_HASH = "a50dc52cd1592f49094795cfe34cc8679902f602e0e3bafe68e75bc7b10b9fe820f7e55ee292c7dba33d6dc19a674744d7ce087e67a04259f7344e99e37b8337"

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
