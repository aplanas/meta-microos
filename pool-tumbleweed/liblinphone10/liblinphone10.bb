SUMMARY = "Web Phone library"
DESCRIPTION = "Linphone is a Web phone with a Qt interface. It lets you make \
two-party calls over IP networks such as the Internet. It uses the IETF \
protocols SIP (Session Initiation Protocol) and RTP (Realtime TransporT \
Protocol) to make calls, so it should be able to communicate with other \
SIP-based Web phones. With several codecs available, it can be used \
with high speed connections as well as 28k modems. \
 \
This package contains a library."
LICENSE = "AGPL-3.0-or-later"

PV = "5.2.98"

RPM_NAME = "liblinphone10-5.2.98-1.1.aarch64.rpm"
RPM_HASH = "cb640ea0f9226bfaff33f4000f5459b86e3a88c0765cb4a0637916fe5cc0ab59848fcc423ee987b967efabf4bbb4d78c34fd182284b4c91bec85d49bb122150b"

RPROVIDES:${PN} += "liblinphone \
liblinphone.so.10 \
liblinphone10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbctoolbox.so.1 \
libbelcard.so.1 \
libbellesip.so.1 \
libbelr.so.1 \
libbzrtp.so.0 \
libc.so.6 \
libgcc-s.so.1 \
liblime.so.0 \
libm.so.6 \
libmediastreamer.so.11 \
libortp.so.15 \
libsoci-core.so.4.0 \
libsoci-sqlite3.so.4.0 \
libsqlite3.so.0 \
libstdc++.so.6 \
libxerces-c-3.2.so \
libxml2.so.2 \
libz.so.1"

inherit rpm
