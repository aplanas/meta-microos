SUMMARY = "Development files for MyGUI"
DESCRIPTION = "MyGUI is a library for creating Graphical User Interfaces (GUIs) \
for games and 3D applications. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of MyGUI."
LICENSE = "MIT"

PV = "3.4.1"

RPM_NAME = "MyGUI-devel-3.4.1-2.1.aarch64.rpm"
RPM_HASH = "ef58aa096fe7bad11762ab67a4b6ea7cf50f2e13d05ec4af1eb3ff12cec192dd30205825f5b6708be906f2a9e9020a414a4b62986da579f42571b023465d0300"

RPROVIDES:${PN} += "MyGUI-devel \
libEditorFramework.so \
libMyGUI.OgrePlatform.so \
pkgconfig-MYGUI"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
MyGUI \
ld-linux-aarch64.so.1 \
libMyGUICommon3-4-1 \
libMyGUIEngine.so.3.4.1 \
libMyGUIEngine3-4-1 \
libOIS-devel \
libOgreMain-devel \
libOgreMain.so.13.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
pkgconfig \
pkgconfig-freetype2 \
pkgconfig-uuid"

inherit rpm
