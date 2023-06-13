SUMMARY = "Plugin for Psi"
DESCRIPTION = "Plugin to support GnuPG end-to-end encryption."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-openpgpplugin-1.5.1615+0-3.1.aarch64.rpm"
RPM_HASH = "b94b1fc2ae4f48fd56a1d1f1874c4b7ce59aa8722655ac49de5ddebbce6d6f0301c5677cb50ee15992e3b719ce1858e91eaf1bcd3b1edf95a56235d7182e4da0"

RPROVIDES:${PN} += "libopenpgpplugin.so()(64bit) \
plugins-gnupgplugin \
psi+-plugins-openpgpplugin \
psi+-plugins-openpgpplugin(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
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
