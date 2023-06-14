SUMMARY = "Headers, docs and command-line utility for assimp"
DESCRIPTION = "Assimp is a library to load and process geometric scenes from various data formats. \
It is tailored at typical game scenarios by supporting a node hierarchy, static or skinned meshes, \
materials, bone animations and potential texture data. The library is not designed for speed, \
it is primarily useful for importing assets from various sources once and storing it in a \
engine-specific format for easy and fast every-day-loading."
LICENSE = "BSD-3-Clause & MIT"

PV = "5.2.5"

RPM_NAME = "assimp-devel-5.2.5-2.1.aarch64.rpm"
RPM_HASH = "0d558c891e693527d6b09f48ea925487da644016edf18b1cbe9c9f4ef53deccab19823d31f43ab324630ec18ee12dba2ead448a5e70fb567fbeb69890940a9f3"

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
