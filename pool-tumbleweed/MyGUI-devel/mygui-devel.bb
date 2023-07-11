SUMMARY = "Development files for MyGUI"
DESCRIPTION = "MyGUI is a library for creating Graphical User Interfaces (GUIs) \
for games and 3D applications. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of MyGUI."
LICENSE = "MIT"

PV = "3.4.1"

RPM_NAME = "MyGUI-devel-3.4.1-2.2.aarch64.rpm"
RPM_HASH = "710550c24823ce18324fccf7bf49be1876e49a6c28f7100c441f98a4df0e90459eadbb9b184a9f882384d5938c6f9495ab25479e5f36ef345329d20c42750eed"

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
