SUMMARY = "Shared library for MyGUI"
DESCRIPTION = "MyGUI is a library for creating Graphical User Interfaces (GUIs) \
for games and 3D applications. \
 \
This package contains the shared library used by most MyGUI tools and demos."
LICENSE = "MIT"

PV = "3.4.1"

RPM_NAME = "libMyGUICommon3_4_1-3.4.1-2.2.aarch64.rpm"
RPM_HASH = "4855ce1329b0dad167fce23c4c56d10a8b358cf3eba2a105bfc4a859f53090832fcc3ece30f0b566f55bfdafee40cd4c23737229ffce084cd8a50def7c128d89"

RPROVIDES:${PN} += "libMyGUICommon.so.3.4.1 \
libMyGUICommon3-4-1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libMyGUI.OgrePlatform.so \
libMyGUIEngine.so.3.4.1 \
libOgreMain.so.13.5 \
libSDL2-2.0.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
