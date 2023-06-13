SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin adds more options to contact's menus."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-extendedmenuplugin-1.5.1615+0-3.1.aarch64.rpm"
RPM_HASH = "969caf1ba02e263d6be403b21130e1184786c758adb70db3fc1cf5812509f82f8456678eec65d14bed834acc886ae059cd76c4d05b28f90dc709624dcae5812b"

RPROVIDES:${PN} += "libextendedmenuplugin.so()(64bit) \
psi+-plugins-extendedmenuplugin \
psi+-plugins-extendedmenuplugin(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
psi+"

inherit rpm
