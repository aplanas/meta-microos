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

RPM_NAME = "shairport-sync-4.2-1.1.aarch64.rpm"
RPM_HASH = "703e614016881d6c10f940694aed6c8c1e4bc3e1e06522dcf344403a2473d911ef4b9ec653a4a21c3a9045b9517a48c7cb4fad7ed2d0f40aa1c7bebe88698bc2"

RPROVIDES:${PN} += "config-shairport-sync \
shairport-sync"

RDEPENDS:${PN} += "/usr/bin/sh \
firewalld \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libc.so.6 \
libconfig.so.11 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libpopt.so.0 \
libpulse.so.0 \
libsndfile.so.1 \
libsoxr.so.0 \
libstdc++.so.6 \
shadow"

inherit rpm
