SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin is designed to monitor the status of specific roster contacts, as \
well as for substitution of standard sounds of incoming messages."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-watcherplugin-1.5.1615+0-3.1.aarch64.rpm"
RPM_HASH = "c3984f8f4e8da812c16e934bd1ec7fe37c92ab23008802ff5b17cb227af82f26caa7357b1af93e374e0f2ed79e26a60430f4537f03ef1c98a5bea34eb476b458"

RPROVIDES:${PN} += "libwatcherplugin.so()(64bit) \
psi+-plugins-watcherplugin \
psi+-plugins-watcherplugin(aarch-64)"

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
