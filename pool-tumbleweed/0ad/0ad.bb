SUMMARY = "A real-time strategy game of ancient warfare"
DESCRIPTION = "0 A.D. (pronounced 'zero ey-dee') is a real-time strategy (RTS) game \
of ancient warfare. It is a historically-based war/economy game that \
allows players to relive or rewrite the history of Western \
civilizations, focusing on the years between 500 B.C. and 500 A.D. \
The project contains 3D graphics, detailed artwork, sound, and a \
flexible game engine."
LICENSE = "BSD-3-Clause & CC-BY-SA-3.0 & GPL-2.0-or-later & LGPL-3.0-or-later & MIT & ISC & MPL-2.0"

PV = "0.0.26"

RPM_NAME = "0ad-0.0.26-2.3.aarch64.rpm"
RPM_HASH = "e3efb696dea0b471e18433837a7927d1a69150e3177b1b34dfcead596fc51bb6bd8d01779bc8941653c0a9b2ef572bb5bc8dc1932a7504f4fbf2042c459c5ba1"

RPROVIDES:${PN} += "0ad \
libAtlasUI.so \
libCollada.so"

RDEPENDS:${PN} += "/usr/bin/sh \
0ad-data \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libX11.so.6 \
libboost-filesystem.so.1.82.0 \
libc.so.6 \
libcurl.so.4 \
libenet.so.7 \
libfmt.so.9 \
libfreetype.so.6 \
libgcc-s.so.1 \
libgloox.so.18 \
libicui18n.so.73 \
libicuuc.so.73 \
libm.so.6 \
libminiupnpc.so.17 \
libmozjs-78.so.0 \
libopenal.so.1 \
libpng16.so.16 \
libsodium.so.23 \
libstdc++.so.6 \
libvorbisfile.so.3 \
libwx-baseu-suse-nostl.so.3.0.5 \
libwx-baseu-xml-suse-nostl.so.3.0.5 \
libwx-gtk2u-core-suse-nostl.so.3.0.5 \
libwx-gtk2u-gl-suse-nostl.so.3.0.5 \
libxml2.so.2 \
libz.so.1"

inherit rpm
