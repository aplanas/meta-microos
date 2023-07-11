SUMMARY = "Portable DjVu Qt4 Based Viewer and Browser Plugin"
DESCRIPTION = "DjView4 is a viewer and browser plugin for DjVu documents,based on the \
DjVuLibre-3.5 library and the Qt4 toolkit."
LICENSE = "GPL-2.0-or-later"

PV = "4.12"

RPM_NAME = "djvulibre-djview4-4.12-2.7.aarch64.rpm"
RPM_HASH = "f21afd66b63623429187b0fd7ecd7f6089fbaad6800e83d18fe434375d14dd6b68779e4b6f7a6dec9d4b90a2afd6f0fa93f36e731b26dd5fe98bd3f2c735eca8"

RPROVIDES:${PN} += "djvulibre-djview4"

RDEPENDS:${PN} += "djvulibre \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5OpenGL.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libdjvulibre.so.21 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libtiff.so.6"

inherit rpm
