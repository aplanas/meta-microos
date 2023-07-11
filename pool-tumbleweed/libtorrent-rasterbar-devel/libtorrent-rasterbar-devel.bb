SUMMARY = "Header files for libtorrent, a C++ implementation of the BitTorrent protocol"
DESCRIPTION = "libtorrent-rasterbar is a C++ library that aims to be a good \
alternative to all the other bittorrent implementations around. \
It is a library and not a full featured client, although it comes \
with a working example client. \
 \
This package holds the development files for libtorrent-rasterbar."
LICENSE = "BSD-3-Clause"

PV = "2.0.9"

RPM_NAME = "libtorrent-rasterbar-devel-2.0.9-1.3.aarch64.rpm"
RPM_HASH = "fbc6e33f8e2a5e084b9b1c4d1b348b208ea7535f1e249580742b4aa5dd5d785d27596ba750e54112a2be8fa2480a007acf634ace4b6406c9d85df245efa5c34e"

RPROVIDES:${PN} += "cmake-LibtorrentRasterbar \
libtorrent-rasterbar-devel \
pkgconfig-libtorrent-rasterbar"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gcc-c++ \
libboost-headers-devel \
libtorrent-rasterbar2-0 \
pkgconfig-openssl"

inherit rpm
