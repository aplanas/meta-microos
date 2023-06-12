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
MyGUI-devel(aarch-64) \
libEditorFramework.so()(64bit) \
libMyGUI.OgrePlatform.so()(64bit) \
pkgconfig(MYGUI)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
MyGUI \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libMyGUICommon3_4_1 \
libMyGUIEngine.so.3.4.1()(64bit) \
libMyGUIEngine3_4_1 \
libOIS-devel \
libOgreMain-devel \
libOgreMain.so.13.5()(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
pkgconfig \
pkgconfig(freetype2) \
pkgconfig(uuid)"

inherit rpm
