SUMMARY = "A BitTorrent library written in C++"
DESCRIPTION = "LibTorrent is a BitTorrent library written in C++. It transfers \
directly from file pages to the network stack, and achieves 3x higher \
seed speeds than the official client on high-bandwidth links."
LICENSE = "SUSE-GPL-2.0+-with-openssl-exception"

PV = "0.13.8"

RPM_NAME = "libtorrent21-0.13.8-2.12.aarch64.rpm"
RPM_HASH = "80b8d920ae43a5f605b30f2e57ef1db062a68d9b6a0b6b53beafd284150dff90ddd2f1dff24b28d37bdc6473a8afdd058afa362e8c3ad1f2c4f76f9634f43e9c"

RPROVIDES:${PN} += "libtorrent.so.21 \
libtorrent21"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
