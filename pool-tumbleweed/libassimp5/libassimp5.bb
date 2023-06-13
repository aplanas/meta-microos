SUMMARY = "Library to load and process 3D scenes from various data formats"
DESCRIPTION = "Assimp is a library to load and process geometric scenes from various data formats. \
It is tailored at typical game scenarios by supporting a node hierarchy, static or skinned meshes, \
materials, bone animations and potential texture data. The library is not designed for speed, \
it is primarily useful for importing assets from various sources once and storing it in a \
engine-specific format for easy and fast every-day-loading."
LICENSE = "BSD-3-Clause & MIT"

PV = "5.2.5"

RPM_NAME = "libassimp5-5.2.5-2.1.aarch64.rpm"
RPM_HASH = "146500244a030edc7f86da1f1875c4ff2a1c882834daa18ed457b1792847992a26a3c8aabbc98588d016f846fae02c8e3057d633a9e20553eb549d0c8418649e"

RPROVIDES:${PN} += "libassimp.so.5()(64bit) \
libassimp5 \
libassimp5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libminizip.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
