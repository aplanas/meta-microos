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

RPM_NAME = "MyGUI-3.4.1-2.2.aarch64.rpm"
RPM_HASH = "323b9ba0c1712b93abfd58c535b26c64d378d83f3039e20cfa2ef4d7b051831210d9811c75f768abcb7457accc6985d840245126530eeb7074b28a7dab83f6ce"

RPROVIDES:${PN} += "MyGUI"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libMyGUIEngine.so.3.4.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
