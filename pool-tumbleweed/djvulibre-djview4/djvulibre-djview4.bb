SUMMARY = "Portable DjVu Qt4 Based Viewer and Browser Plugin"
DESCRIPTION = "DjView4 is a viewer and browser plugin for DjVu documents,based on the \
DjVuLibre-3.5 library and the Qt4 toolkit."
LICENSE = "GPL-2.0-or-later"

PV = "4.12"

RPM_NAME = "djvulibre-djview4-4.12-2.6.aarch64.rpm"
RPM_HASH = "ff54a3bb2d3bf75d30224c79db246a06d5b9984a41aa29ca75325ce81bc3cc98e30a6ad0c3eae030549a5ad8f32dc2632d9e82d4125688bdb78c60cc9b51e07a"

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
