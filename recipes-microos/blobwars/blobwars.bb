SUMMARY = "Mission and Objective based 2D Platform Game"
DESCRIPTION = "Blob Wars : Metal Blob Solid. This is Episode I of the Blob Wars Saga. \
This is a platform game, not unlike those found on the Amiga and SNES. \
The object of the game is to take on the role of solider Blob, Bob, \
and play through the various levels and attempt to rescue as many MIA \
(Missing In Action) Blobs as possible. This is not quite as straight \
forward as it sounds, since the MIAs will often be not directly \
reachable and will require some extra thought. Bob also has to \
contend with environmental hazards, alien invaders and assimilated Blobs."
LICENSE = "GPL-2.0+"

PV = "2.00"

RPM_NAME = "blobwars-2.00-2.22.aarch64.rpm"
RPM_HASH = "8c9a6d778c05be1b271636da9838809b4ecad0015b7b9f3a8b1aa9677732971512062ce13f381746d0f95f66115f44ef4b8bac8ca2e576ade47fceecea356425"

RPROVIDES:${PN} += "application() application(blobwars.desktop) blobwars blobwars(aarch-64) metainfo() metainfo(blobwars.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libSDL2-2.0.so.0()(64bit) libSDL2_image-2.0.so.0()(64bit) libSDL2_mixer-2.0.so.0()(64bit) libSDL2_net-2.0.so.0()(64bit) libSDL2_ttf-2.0.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libz.so.1()(64bit)"

inherit rpm
