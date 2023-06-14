SUMMARY = "Header files for libtorrent, a C++ implementation of the BitTorrent protocol"
DESCRIPTION = "libtorrent-rasterbar is a C++ library that aims to be a good \
alternative to all the other bittorrent implementations around. \
It is a library and not a full featured client, although it comes \
with a working example client. \
 \
This package holds the development files for libtorrent-rasterbar."
LICENSE = "BSD-3-Clause"

PV = "2.0.9"

RPM_NAME = "libtorrent-rasterbar-devel-2.0.9-1.1.aarch64.rpm"
RPM_HASH = "af3f0d6d213d7ef37f6b3792d2cd0f7b1ea1b9fba4526e33db7978611e6067c134b11d9e66fa13c3c3398ddfecc130ee3c5d9415e3463b740808a740ce2c2119"

RPROVIDES:${PN} += "cmake-LibtorrentRasterbar \
libtorrent-rasterbar-devel \
pkgconfig-libtorrent-rasterbar"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gcc-c++ \
libboost-headers-devel \
libtorrent-rasterbar2-0 \
pkgconfig-openssl"

inherit rpm
