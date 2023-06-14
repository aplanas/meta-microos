SUMMARY = "Web Phone Development files"
DESCRIPTION = "Linphone is a Web phone with a Qt interface. It lets you make \
two-party calls over IP networks such as the Internet. It uses the IETF \
protocols SIP (Session Initiation Protocol) and RTP (Realtime TransporT \
Protocol) to make calls, so it should be able to communicate with other \
SIP-based Web phones. With several codecs available, it can be used \
with high speed connections as well as 28k modems."
LICENSE = "AGPL-3.0-or-later"

PV = "5.2.50"

RPM_NAME = "liblinphone-devel-5.2.50-1.1.aarch64.rpm"
RPM_HASH = "318c6af3053c2947b3b0b286dd1f10a966853e4465cf1bb404149fd6116ec5033efa3efdec7aa97cc57455408d9f7923e6b130068cf272600e3815c8fb991537"

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
