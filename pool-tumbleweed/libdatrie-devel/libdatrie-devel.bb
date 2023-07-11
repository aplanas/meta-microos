SUMMARY = "Development files for the Double-Array Trie library"
DESCRIPTION = "This is an implementation of double-array structure for representing \
trie, as proposed by Junichi Aoe. \
 \
This package contains the development files for libdatrie."
LICENSE = "LGPL-2.1-only"

PV = "0.2.13"

RPM_NAME = "libdatrie-devel-0.2.13-1.11.aarch64.rpm"
RPM_HASH = "b0d78d8928f33a02cd2a5c9add94bc39298347edc97e0b8fb47e5b36b375046ead10f96babe3cb87b9e0e7b2d8f32e6bdefd589bdf24c4f393b4db33fc148dcd"

RPROVIDES:${PN} += "libdatrie-devel \
pkgconfig-datrie-0.2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdatrie.so.1 \
libdatrie1"

inherit rpm
