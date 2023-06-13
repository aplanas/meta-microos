SUMMARY = "Shared object for GTK2 hosts displaying Qt5 LV2 GUIs"
DESCRIPTION = "Module plugin for: \
* GTK2 hosts displaying Qt5 LV2 GUIs using suil"
LICENSE = "ISC"

PV = "0.10.18"

RPM_NAME = "suil-plugin-gtk2-in-qt5-0.10.18-1.1.aarch64.rpm"
RPM_HASH = "52971745c5cb5515a8994b872def3b8158e6c0e41e49ee486a41a0710068d49a8f7c71fc08169caf900822bef59ec5ce63c668f7bf9dd0a49677bfda42f8367a"

RPROVIDES:${PN} += "libsuil_gtk2_in_qt5.so()(64bit) \
suil-plugin-gtk2-in-qt5 \
suil-plugin-gtk2-in-qt5(aarch-64)"

RDEPENDS:${PN} += "gtk2-tools \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libsuil-0-0"

inherit rpm
