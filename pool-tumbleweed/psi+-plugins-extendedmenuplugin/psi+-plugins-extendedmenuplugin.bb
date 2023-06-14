SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin adds more options to contact's menus."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-extendedmenuplugin-1.5.1615+0-3.1.aarch64.rpm"
RPM_HASH = "969caf1ba02e263d6be403b21130e1184786c758adb70db3fc1cf5812509f82f8456678eec65d14bed834acc886ae059cd76c4d05b28f90dc709624dcae5812b"

RPROVIDES:${PN} += "libextendedmenuplugin.so \
psi+-plugins-extendedmenuplugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
psi+"

inherit rpm
