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

RPROVIDES:${PN} += "config(owntone) \
forked-daapd \
owntone \
owntone(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libasound.so.2(ALSA_0.9.0rc4)(64bit) \
libavahi-client.so.3()(64bit) \
libavahi-common.so.3()(64bit) \
libavcodec.so.60()(64bit) \
libavcodec.so.60(LIBAVCODEC_60.3_SUSE)(64bit) \
libavfilter.so.9()(64bit) \
libavfilter.so.9(LIBAVFILTER_9.3_SUSE)(64bit) \
libavformat.so.60()(64bit) \
libavformat.so.60(LIBAVFORMAT_60.3_SUSE)(64bit) \
libavutil.so.58()(64bit) \
libavutil.so.58(LIBAVUTIL_58.2_SUSE)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libconfuse.so.2()(64bit) \
libcurl.so.4()(64bit) \
libevent-2.1.so.7()(64bit) \
libevent_pthreads-2.1.so.7()(64bit) \
libgcrypt.so.20()(64bit) \
libgcrypt.so.20(GCRYPT_1.6)(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
libgpg-error.so.0()(64bit) \
libgpg-error.so.0(GPG_ERROR_1.0)(64bit) \
libjson-c.so.5()(64bit) \
libjson-c.so.5(JSONC_0.14)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmxml.so.1()(64bit) \
libplist-2.0.so.3()(64bit) \
libprotobuf-c.so.1()(64bit) \
libprotobuf-c.so.1(LIBPROTOBUF_C_1.0.0)(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit) \
libsodium.so.23()(64bit) \
libsqlite3.so.0()(64bit) \
libunistring.so.5()(64bit) \
libwebsockets.so.19()(64bit) \
libz.so.1()(64bit) \
logrotate \
pwdutils"

inherit rpm
