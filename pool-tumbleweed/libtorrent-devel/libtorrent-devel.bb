SUMMARY = "Development files for libtorrent, a C++ BitTorrent library"
DESCRIPTION = "LibTorrent is a BitTorrent library written in C++. It transfers \
directly from file pages to the network stack, and achieves 3x higher \
seed speeds than the official client on high-bandwidth links."
LICENSE = "SUSE-GPL-2.0+-with-openssl-exception"

PV = "0.13.8"

RPM_NAME = "libtorrent-devel-0.13.8-2.13.aarch64.rpm"
RPM_HASH = "70782f1be4d94c2f4b1cdd13c2b89b5786ae16bfc88597a66bbe5a711deb34e0ee9e37a68624cd5cd337be7f8d1a8524dd77d542fee6087903b4f767976efc98"

RPROVIDES:${PN} += "libtorrent-devel \
pkgconfig-libtorrent"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtorrent21"

inherit rpm
