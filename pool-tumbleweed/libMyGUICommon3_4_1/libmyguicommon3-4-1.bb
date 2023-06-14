SUMMARY = "Shared library for MyGUI"
DESCRIPTION = "MyGUI is a library for creating Graphical User Interfaces (GUIs) \
for games and 3D applications. \
 \
This package contains the shared library used by most MyGUI tools and demos."
LICENSE = "MIT"

PV = "3.4.1"

RPM_NAME = "libMyGUICommon3_4_1-3.4.1-2.1.aarch64.rpm"
RPM_HASH = "d3a52fae8e240cb9b2bf2acd62f68e686e834c4397013f611e1719208f0d6824e21ca6bc58c7ab4417098c1f5c1a3f83f000ce3b2a407d463ef818560fe1a8cf"

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
