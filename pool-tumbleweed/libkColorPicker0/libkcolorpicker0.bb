SUMMARY = "Qt based Color Picker with popup menu"
DESCRIPTION = "QToolButton with color popup menu with lets you select a color. The popup \
featues a color dialog button which can be used to add custom colors to the \
popup menu."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.0"

RPM_NAME = "libkColorPicker0-0.2.0-1.5.aarch64.rpm"
RPM_HASH = "35366af12a8d623291144eacbd103524d2944723bfcb552f37c27029fc65fa5c308c592781e667501ecc79f8554bea49d139d62cc25b62ace15cc91fb1c7bc87"

RPROVIDES:${PN} += "libkColorPicker.so.0()(64bit) \
libkColorPicker0 \
libkColorPicker0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
