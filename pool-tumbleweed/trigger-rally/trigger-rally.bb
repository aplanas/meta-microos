SUMMARY = "Fast-paced single-player rally racing game"
DESCRIPTION = "A 3D rally simulation with a physics engine for drifting, over 100 maps, \
different terrain materials like dirt, asphalt, sand, ice etc. and various \
weather, light and fog conditions. Most maps are equipped with spoken co-driver \
notes and co-driver icons."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.6.1"

RPM_NAME = "trigger-rally-0.6.6.1-3.8.aarch64.rpm"
RPM_HASH = "f9b9716af158eb9783313be91558d2f13df27adb71d94dfe3370d2506263f6127af781db4f75652383eef72be8a71e8276e5712856e352e251048e9d367a28ef"

RPROVIDES:${PN} += "application() \
application(trigger-rally.desktop) \
metainfo() \
metainfo(trigger-rally.appdata.xml) \
trigger-rally \
trigger-rally(aarch-64)"

RDEPENDS:${PN} += "libGL.so.1()(64bit) \
libGLEW.so.2.2()(64bit) \
libGLU.so.1()(64bit) \
libSDL2-2.0.so.0()(64bit) \
libSDL2_image-2.0.so.0()(64bit) \
libalut.so.0()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libopenal.so.1()(64bit) \
libphysfs.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libtinyxml2.so.9()(64bit) \
trigger-rally-data"

inherit rpm
