SUMMARY = "Web Phone Development files"
DESCRIPTION = "Linphone is a Web phone with a Qt interface. It lets you make \
two-party calls over IP networks such as the Internet. It uses the IETF \
protocols SIP (Session Initiation Protocol) and RTP (Realtime TransporT \
Protocol) to make calls, so it should be able to communicate with other \
SIP-based Web phones. With several codecs available, it can be used \
with high speed connections as well as 28k modems."
LICENSE = "AGPL-3.0-or-later"

PV = "5.2.50"

RPM_NAME = "liblinphone-devel-5.2.50-1.3.aarch64.rpm"
RPM_HASH = "a654e832d08500f11b8b3866e99abfd46bce6de173a811f02baed38c28e35005c4617884130590e608f7759b24900dadccc15a049473323173bac8284a586721"

RPROVIDES:${PN} += "liblinphone-devel \
linphone-devel \
pkgconfig-linphone"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
ld-linux-aarch64.so.1 \
libbctoolbox-tester.so.1 \
libbctoolbox.so.1 \
libbellesip.so.1 \
libbelr.so.1 \
libc.so.6 \
libeXosip2-devel \
libgcc-s.so.1 \
liblime.so.0 \
liblinphone++.so.10 \
liblinphone++10 \
liblinphone-data \
liblinphone.so.10 \
liblinphone10 \
libm.so.6 \
libmediastreamer.so.11 \
libortp.so.15 \
libosip2-devel \
libsoci-core.so.4.0 \
libsoci-sqlite3.so.4.0 \
libsqlite3.so.0 \
libstdc++.so.6 \
libxml2.so.2 \
libz.so.1 \
pkgconfig-alsa \
pkgconfig-belcard \
pkgconfig-belle-sip \
pkgconfig-glib-2.0 \
pkgconfig-libavcodec \
pkgconfig-libswscale \
pkgconfig-mediastreamer \
pkgconfig-speex \
soci-devel \
soci-sqlite3-devel"

inherit rpm
