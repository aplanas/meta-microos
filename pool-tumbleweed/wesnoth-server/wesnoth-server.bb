SUMMARY = "Multiplayer server for Battle for Wesnoth"
DESCRIPTION = "This package contains the server program hosting multiplayer games of \
Battle for Wesnoth."
LICENSE = "EPL-1.0 & GPL-2.0-or-later"

PV = "1.17.16"

RPM_NAME = "wesnoth-server-1.17.16-1.1.aarch64.rpm"
RPM_HASH = "cc86b005540fb06f5c67f6014975c6f597893e39b234e4560c1faea6d6687a6d77d2d3e42e118d13bf4b7288fa890b21437ae1eb423f71ef2b5686001c68a268"

RPROVIDES:${PN} += "wesnoth-server \
wesnoth-server(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libboost_coroutine.so.1.82.0()(64bit) \
libboost_filesystem.so.1.82.0()(64bit) \
libboost_iostreams.so.1.82.0()(64bit) \
libboost_locale.so.1.82.0()(64bit) \
libboost_random.so.1.82.0()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libssl.so.3()(64bit) \
libstdc++.so.6()(64bit) \
wesnoth-fslayout"

inherit rpm
