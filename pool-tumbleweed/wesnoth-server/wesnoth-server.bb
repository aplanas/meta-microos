SUMMARY = "Multiplayer server for Battle for Wesnoth"
DESCRIPTION = "This package contains the server program hosting multiplayer games of \
Battle for Wesnoth."
LICENSE = "EPL-1.0 & GPL-2.0-or-later"

PV = "1.17.17"

RPM_NAME = "wesnoth-server-1.17.17-1.1.aarch64.rpm"
RPM_HASH = "c07461b9ff7b813aad9747d25196a8d833559f4d605f1022f6ad62fbd7a0065ed3fc25c8200c3077b2f93ffd942459020b6a98257781ec021ff23382d19108b6"

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
