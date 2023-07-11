SUMMARY = "Headers, docs and command-line utility for assimp"
DESCRIPTION = "Assimp is a library to load and process geometric scenes from various data formats. \
It is tailored at typical game scenarios by supporting a node hierarchy, static or skinned meshes, \
materials, bone animations and potential texture data. The library is not designed for speed, \
it is primarily useful for importing assets from various sources once and storing it in a \
engine-specific format for easy and fast every-day-loading."
LICENSE = "BSD-3-Clause & MIT"

PV = "5.2.5"

RPM_NAME = "assimp-devel-5.2.5-2.2.aarch64.rpm"
RPM_HASH = "76754a78ffd43bfef58f425343e2b24a814724787f97be853a68a9cf06701030b91b0de6622041d16e62edcd3bd1da8aa7a4c40f17ad965dabc63eaf76ab1b0d"

RPROVIDES:${PN} += "assimp-devel \
cmake-assimp \
pkgconfig-assimp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
ld-linux-aarch64.so.1 \
libassimp.so.5 \
libassimp5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++-devel \
libstdc++.so.6 \
pkgconfig-minizip"

inherit rpm
