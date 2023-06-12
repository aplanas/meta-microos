SUMMARY = "Shared object for Qt5 hosts displaying GTK3 LV2 GUIs"
DESCRIPTION = "Module plugin for: \
* Qt5 hosts displaying GTK2 LV2 GUIs using suil"
LICENSE = "ISC"

PV = "0.10.18"

RPM_NAME = "suil-plugin-qt5-in-gtk3-0.10.18-1.1.aarch64.rpm"
RPM_HASH = "371fa87cd5eccf52679130ce2091f712f488906c29dda93a96084b315ef47590b6660eaa665ddba1cbfa199b77c8407c7360897c88c1ba0a2d2dbe1e8429a4d1"

RPROVIDES:${PN} += "libsuil_qt5_in_gtk3.so()(64bit) \
suil-plugin-qt5-in-gtk3 \
suil-plugin-qt5-in-gtk3(aarch-64)"
RDEPENDS:${PN} += "libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libsuil-0-0"

inherit rpm
