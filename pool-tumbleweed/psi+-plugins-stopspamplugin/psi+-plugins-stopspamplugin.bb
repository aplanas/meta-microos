SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin is designed to block spam messages and other unwanted information \
from Psi+ users."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-stopspamplugin-1.5.1615+0-3.2.aarch64.rpm"
RPM_HASH = "18da7ad3cc582905414b0cb2997ce34caf1b4dcef28ce020ede72e5c4365e3f9803156dcdf178a22c0e4bdc2774d7b31553bcfc665a8eb437351bcd1965b448e"

RPROVIDES:${PN} += "libstopspamplugin.so \
psi+-plugins-stopspamplugin"

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
