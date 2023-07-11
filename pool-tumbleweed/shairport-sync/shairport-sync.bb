SUMMARY = "An AirPlay audio player"
DESCRIPTION = "Shairport Sync is an AirPlay audio player – it plays audio streamed from iTunes, \
iOS, Apple TV and macOS devices and AirPlay sources such as Quicktime Player and \
ForkedDaapd, among others. \
 \
Audio played by a Shairport Sync-powered device stays synchronised with the \
source and hence with similar devices playing the same source. In this way, \
synchronised multi-room audio is possible for players that support it, such as \
iTunes. \
 \
Shairport Sync runs on Linux, FreeBSD and OpenBSD. It does not support AirPlay \
video or photo streaming."
LICENSE = "GPL-3.0-only"

PV = "4.2"

RPM_NAME = "shairport-sync-4.2-3.1.aarch64.rpm"
RPM_HASH = "1b66e4f719911cb62cef2764f8ebe4f01d245d264097081c77b4b36f77c16b0fa1960a4c285fd1146fdd2ed02c17b8a47eb99654fd462d0c6c1e4e74410ebadb"

RPROVIDES:${PN} += "config-shairport-sync \
shairport-sync"

RDEPENDS:${PN} += "/usr/bin/sh \
firewalld \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libavcodec.so.60 \
libavutil.so.58 \
libc.so.6 \
libconfig.so.11 \
libcrypto.so.3 \
libgcc-s.so.1 \
libgcrypt.so.20 \
libm.so.6 \
libpipewire-0.3.so.0 \
libplist-2.0.so.4 \
libpopt.so.0 \
libpulse.so.0 \
libsndfile.so.1 \
libsodium.so.23 \
libsoxr.so.0 \
libstdc++.so.6 \
libswresample.so.4 \
libuuid.so.1 \
nqptp \
shadow"

inherit rpm
