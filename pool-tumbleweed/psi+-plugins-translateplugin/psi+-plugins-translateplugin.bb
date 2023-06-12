SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin allows you to convert selected text into another language."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-translateplugin-1.5.1615+0-3.1.aarch64.rpm"
RPM_HASH = "a5497269bc03ed4eda39da038476e04a17c9b7d373a120084eae763a77e48a7b95083a887767bfbcd7f9e11752428b3b241e08f7ca4ed49573d2d8da95db4a1f"

RPROVIDES:${PN} += "libtranslateplugin.so()(64bit) \
psi+-plugins-translateplugin \
psi+-plugins-translateplugin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
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
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
psi+"

inherit rpm
