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

PV = "5.2.50"

RPM_NAME = "linphone-cli-5.2.50-1.1.aarch64.rpm"
RPM_HASH = "1387181efe6985c16bacc73ef952a4e8e8f0055fc292a130e00f64de7c9bdec15780807a0f1014a16689585552f9c363cd90d9edd4de6412ad8267a15cd97c40"

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
