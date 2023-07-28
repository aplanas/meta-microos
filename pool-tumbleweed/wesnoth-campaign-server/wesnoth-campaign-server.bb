SUMMARY = "Battle for Wesnoth: campaign server"
DESCRIPTION = "The campaign server acts as a simple download server, much like ftp, to \
provide a collection of Wesnoth campaigns to players."
LICENSE = "EPL-1.0 & GPL-2.0-or-later"

PV = "1.17.17"

RPM_NAME = "wesnoth-campaign-server-1.17.17-1.1.aarch64.rpm"
RPM_HASH = "d624c07bb101f7c259a9d01cbeb69f8ba8d3ba67ce0916c5f291bd2439b70157d7a4ff75b5d561207eb39915471f588c1b0757e2dbf32d7ff28dd9d954906c0b"

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
