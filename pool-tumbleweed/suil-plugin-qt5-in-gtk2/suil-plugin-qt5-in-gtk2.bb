SUMMARY = "Shared object for Qt5 hosts displaying GTK2 LV2 GUIs"
DESCRIPTION = "Module plugin for: \
* Qt5 hosts displaying GTK2 LV2 GUIs using suil"
LICENSE = "ISC"

PV = "0.10.18"

RPM_NAME = "suil-plugin-qt5-in-gtk2-0.10.18-1.1.aarch64.rpm"
RPM_HASH = "4d5a849539ffa9c1be3fc98421a1aeff3df4f11d3c643c9f3d6255da13b42c611f858aa0005d533adb685e08d9d482bf46ae42eae03bdcd585c31a33ae5cd425"

RPROVIDES:${PN} += "libsuil-qt5-in-gtk2.so \
suil-plugin-qt5-in-gtk2"

RDEPENDS:${PN} += "libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libstdc++.so.6 \
libsuil-0-0"

inherit rpm
