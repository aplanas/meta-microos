SUMMARY = "Library to load and process 3D scenes from various data formats"
DESCRIPTION = "Assimp is a library to load and process geometric scenes from various data formats. \
It is tailored at typical game scenarios by supporting a node hierarchy, static or skinned meshes, \
materials, bone animations and potential texture data. The library is not designed for speed, \
it is primarily useful for importing assets from various sources once and storing it in a \
engine-specific format for easy and fast every-day-loading."
LICENSE = "BSD-3-Clause & MIT"

PV = "5.2.5"

RPM_NAME = "libassimp5-5.2.5-2.2.aarch64.rpm"
RPM_HASH = "7290f061fd92a93e3ee7b3d0e436becbaf9ce997498a6fc2b5c70d8899200a1a9a82572b459ac186241638039fa2fb44e4ef90fb80c8eb1b4be0d450584273b1"

RPROVIDES:${PN} += "libassimp.so.5 \
libassimp5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libminizip.so.1 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
