SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin adds more options to contact's menus."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-extendedmenuplugin-1.5.1615+0-3.2.aarch64.rpm"
RPM_HASH = "2dab9d1c790480ea0bcd92f0bda59081dca6def00e18753fd9cd1c7f076d6f01b25ba1e39a88c08522240ec790ac9437ad4e4b39dd70314cacf6326690441684"

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
