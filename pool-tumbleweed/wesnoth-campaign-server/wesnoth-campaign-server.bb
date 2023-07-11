SUMMARY = "Battle for Wesnoth: campaign server"
DESCRIPTION = "The campaign server acts as a simple download server, much like ftp, to \
provide a collection of Wesnoth campaigns to players."
LICENSE = "EPL-1.0 & GPL-2.0-or-later"

PV = "1.17.16"

RPM_NAME = "wesnoth-campaign-server-1.17.16-1.2.aarch64.rpm"
RPM_HASH = "e0bff9aeac3df39687fb57d0ff93057ea8c87a7aaf8396ed491b22aaef7a177f117ec56418f16ca14aefef773b417bf65438b58c46ec5475d0626011f117f103"

RPROVIDES:${PN} += "wesnoth-campaign-server"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libboost-coroutine.so.1.82.0 \
libboost-filesystem.so.1.82.0 \
libboost-iostreams.so.1.82.0 \
libboost-locale.so.1.82.0 \
libboost-program-options.so.1.82.0 \
libboost-random.so.1.82.0 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libssl.so.3 \
libstdc++.so.6 \
wesnoth-fslayout"

inherit rpm
