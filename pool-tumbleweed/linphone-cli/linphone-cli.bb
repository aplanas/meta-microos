SUMMARY = "Web Phone Command Line Interface"
DESCRIPTION = "Linphone is a Web phone with a Qt interface. It lets you make \
two-party calls over IP networks such as the Internet. It uses the IETF \
protocols SIP (Session Initiation Protocol) and RTP (Realtime TransporT \
Protocol) to make calls, so it should be able to communicate with other \
SIP-based Web phones. With several codecs available, it can be used \
with high speed connections as well as 28k modems. \
 \
This package contains the command line interface."
LICENSE = "AGPL-3.0-or-later"

PV = "5.2.98"

RPM_NAME = "linphone-cli-5.2.98-1.1.aarch64.rpm"
RPM_HASH = "ca0b8ca65ef2442fdf119f2216fa955400ddae520a6a70a28c2abb4c1d65fe0785441de4931d89a7cbd451fa51f999ab1b8f82adf4901d3e01916330e872e5c8"

RPROVIDES:${PN} += "linphone-cli"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbctoolbox.so.1 \
libbellesip.so.1 \
libc.so.6 \
libgcc-s.so.1 \
liblime.so.0 \
liblinphone-data \
liblinphone.so.10 \
libm.so.6 \
libmediastreamer.so.11 \
libortp.so.15 \
libreadline.so.8 \
libstdc++.so.6"

inherit rpm
