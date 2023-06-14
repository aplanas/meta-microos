SUMMARY = "A C++ implementation of the BitTorrent protocol"
DESCRIPTION = "libtorrent-rasterbar is a C++ library that aims to be a good \
alternative to all the other bittorrent implementations around. \
It is a library and not a full featured client, although it comes \
with a working example client."
LICENSE = "BSD-3-Clause"

PV = "2.0.9"

RPM_NAME = "libtorrent-rasterbar2_0-2.0.9-1.1.aarch64.rpm"
RPM_HASH = "9da08571856646b2bc1899f95d00d7febfe6a70a9a5a141e30f940ee969748ebbbdfeadeb5b87cb7db4d2a1150688eca9b176b332e9f5704a5faf34898501b55"

RPROVIDES:${PN} += "libtorrent-rasterbar.so.2.0 \
libtorrent-rasterbar2-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libssl.so.3 \
libstdc++.so.6"

inherit rpm
