SUMMARY = "A GUI library for Ogre Rendering Engine"
DESCRIPTION = "MyGUI is a library for creating Graphical User Interfaces (GUIs) \
for games and 3D applications. \
 \
MyGUI has overlays for text and for simple rectangles, allowing \
uniting them in one batch. \
 \
The library supports plugins that allow you to create \
dynamically-loaded custom controls or subsystems. Most subsystems are \
expandable with plugins without the need to touch the core code. All \
resources and settings are described in XML files. It is possible to \
load resources like fonts, cursors, images, skins, etc. Forms \
(layouts) via dynamically by using XML files. \
 \
This package contains ImageSetViewer and LayoutEditor."
LICENSE = "MIT"

PV = "3.4.1"

RPM_NAME = "MyGUI-3.4.1-2.1.aarch64.rpm"
RPM_HASH = "b443bcd346a102f46a9d4d3e838db7e30d912cd6e99b8de937cdf297d8bbc6a4a1ddf29a953782414853e635e15205d1715b7f1cb47af862336054014f663396"

RPROVIDES:${PN} += "MyGUI \
MyGUI(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libMyGUIEngine.so.3.4.1()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
