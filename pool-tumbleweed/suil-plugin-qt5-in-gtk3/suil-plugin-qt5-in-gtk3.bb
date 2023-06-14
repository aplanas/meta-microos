SUMMARY = "Shared object for Qt5 hosts displaying GTK3 LV2 GUIs"
DESCRIPTION = "Module plugin for: \
* Qt5 hosts displaying GTK2 LV2 GUIs using suil"
LICENSE = "ISC"

PV = "0.10.18"

RPM_NAME = "suil-plugin-qt5-in-gtk3-0.10.18-1.1.aarch64.rpm"
RPM_HASH = "371fa87cd5eccf52679130ce2091f712f488906c29dda93a96084b315ef47590b6660eaa665ddba1cbfa199b77c8407c7360897c88c1ba0a2d2dbe1e8429a4d1"

RPROVIDES:${PN} += "libsuil-qt5-in-gtk3.so \
suil-plugin-qt5-in-gtk3"

RDEPENDS:${PN} += "libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libstdc++.so.6 \
libsuil-0-0"

inherit rpm
