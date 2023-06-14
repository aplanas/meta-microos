SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin is designed to show reminders of upcoming birthdays."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-birthdayreminderplugin-1.5.1615+0-3.1.aarch64.rpm"
RPM_HASH = "2481a10598792c698c29f001b0b1aa68f4bc00e4464257257917734f188971db8fd33f0a6a8ba151bce5ac868d8b5034a817a655739b3df006ff22b6d814d5a6"

RPROVIDES:${PN} += "libbirthdayreminderplugin.so \
psi+-plugins-birthdayreminderplugin"

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
