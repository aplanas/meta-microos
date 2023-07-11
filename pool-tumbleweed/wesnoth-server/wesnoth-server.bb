SUMMARY = "Multiplayer server for Battle for Wesnoth"
DESCRIPTION = "This package contains the server program hosting multiplayer games of \
Battle for Wesnoth."
LICENSE = "EPL-1.0 & GPL-2.0-or-later"

PV = "1.17.16"

RPM_NAME = "wesnoth-server-1.17.16-1.2.aarch64.rpm"
RPM_HASH = "4911920f5b2f998932872801159d1f163163d1c04b3561b283c473d1b7dede9858e86d9c513c49939f8d42f111a3237193db8d008f9f52e441f3b69cb7cc48de"

RPROVIDES:${PN} += "wesnoth-server"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libboost-coroutine.so.1.82.0 \
libboost-filesystem.so.1.82.0 \
libboost-iostreams.so.1.82.0 \
libboost-locale.so.1.82.0 \
libboost-random.so.1.82.0 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libssl.so.3 \
libstdc++.so.6 \
wesnoth-fslayout"

inherit rpm
