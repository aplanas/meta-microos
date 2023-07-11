SUMMARY = "A C++ implementation of the BitTorrent protocol"
DESCRIPTION = "libtorrent-rasterbar is a C++ library that aims to be a good \
alternative to all the other bittorrent implementations around. \
It is a library and not a full featured client, although it comes \
with a working example client."
LICENSE = "BSD-3-Clause"

PV = "2.0.9"

RPM_NAME = "libtorrent-rasterbar2_0-2.0.9-1.3.aarch64.rpm"
RPM_HASH = "e4cfbcd74ba23e2684a0b8a8ec3a08eb72c002d4ff5cc1dff0854a133d9d38457a4b076247209e44ec560dbf3aeda2b8c8cc73dc25980b895b57830eef095e99"

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
