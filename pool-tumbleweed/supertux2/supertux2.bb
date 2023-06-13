SUMMARY = "Jump'n run game"
DESCRIPTION = "SuperTux is a classic 2D jump'n run sidescroller game in a similar \
style like the original SuperMario games."
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-or-later & GPL-2.0-or-later & GPL-1.0-only"

PV = "0.6.3"

RPM_NAME = "supertux2-0.6.3-2.9.aarch64.rpm"
RPM_HASH = "512919c73000a07ee0d7b6423a275e473ad1bb909c5fecc4a3c7ae894f628b886aab0521f6ccf4362d3cdb3395ab4c94320148c298e7b1f212bf1213dbd7e0a5"

RPROVIDES:${PN} += "application() \
application(supertux2.desktop) \
metainfo() \
metainfo(supertux2.appdata.xml) \
supertux2 \
supertux2(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libGL.so.1()(64bit) \
libGLEW.so.2.2()(64bit) \
libSDL2-2.0.so.0()(64bit) \
libSDL2_image-2.0.so.0()(64bit) \
libboost_filesystem.so.1.82.0()(64bit) \
libc.so.6()(64bit) \
libcurl.so.4()(64bit) \
libfreetype.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libopenal.so.1()(64bit) \
libphysfs.so.1()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libraqm.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libvorbisfile.so.3()(64bit) \
libz.so.1()(64bit)"

inherit rpm
