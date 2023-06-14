SUMMARY = "DAAP server for iTunes and Chromecast with MPD and RSP support"
DESCRIPTION = "owntone is a DAAP/DACP (iTunes), MPD (Music Player Daemon) \
and RSP (Roku) media server. \
 \
It has support for AirPlay devices/speakers, Apple Remote (and compatibles), \
MPD clients, Chromecast, network streaming, internet radio, Spotify and LastFM. \
 \
It does not support streaming video by AirPlay nor Chromecast. \
 \
DAAP stands for Digital Audio Access Protocol, and is the protocol used \
by iTunes and friends to share/stream media libraries over the network. \
 \
owntone is a complete rewrite of mt-daapd (Firefly Media Server)."
LICENSE = "GPL-2.0-or-later"

PV = "28.6"

RPM_NAME = "owntone-28.6-1.2.aarch64.rpm"
RPM_HASH = "30234456217cb44b7ac79f9c501478fd503491d147e180297f9754ea9594af488ecea7cd47d1564817d7cf1dd0342d9f8c241e2adeeb22c97667f373c6fe6521"

RPROVIDES:${PN} += "config-owntone \
forked-daapd \
owntone"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libavcodec.so.60 \
libavfilter.so.9 \
libavformat.so.60 \
libavutil.so.58 \
libc.so.6 \
libconfuse.so.2 \
libcurl.so.4 \
libevent-2.1.so.7 \
libevent-pthreads-2.1.so.7 \
libgcrypt.so.20 \
libgnutls.so.30 \
libgpg-error.so.0 \
libjson-c.so.5 \
libm.so.6 \
libmxml.so.1 \
libplist-2.0.so.3 \
libprotobuf-c.so.1 \
libpulse.so.0 \
libsodium.so.23 \
libsqlite3.so.0 \
libunistring.so.5 \
libwebsockets.so.19 \
libz.so.1 \
logrotate \
pwdutils"

inherit rpm
