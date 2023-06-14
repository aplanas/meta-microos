SUMMARY = "Battle for Wesnoth: campaign server"
DESCRIPTION = "The campaign server acts as a simple download server, much like ftp, to \
provide a collection of Wesnoth campaigns to players."
LICENSE = "EPL-1.0 & GPL-2.0-or-later"

PV = "1.17.16"

RPM_NAME = "wesnoth-campaign-server-1.17.16-1.1.aarch64.rpm"
RPM_HASH = "ec8da508b6510c1819109708a088c8105d7a827f8caf4044d7ccf18b70010cd247ba8cce201985b289c0d39b299f4cafcf56ed2c9161f330fbdf67344f1e9e70"

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
