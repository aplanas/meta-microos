SUMMARY = "A BitTorrent library written in C++"
DESCRIPTION = "LibTorrent is a BitTorrent library written in C++. It transfers \
directly from file pages to the network stack, and achieves 3x higher \
seed speeds than the official client on high-bandwidth links."
LICENSE = "SUSE-GPL-2.0+-with-openssl-exception"

PV = "0.13.8"

RPM_NAME = "libtorrent21-0.13.8-2.13.aarch64.rpm"
RPM_HASH = "91bd26204804651e5db37ab866571a348ee4bbc066a36879f6b494aeb966f73957fad65ae484ae82e9b5353123f864947d10e13e3e927c44c8b147300a5689e2"

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
