SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin is designed to show reminders of upcoming birthdays."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-birthdayreminderplugin-1.5.1615+0-3.2.aarch64.rpm"
RPM_HASH = "6182533f73488c509a8faf563b071ec80bcc0e54a5d11014f6b597f6b24622ce0c8efd8f8b2f4184d3d11f2179701e6e572d1609c4aa612d06195b9216943f7b"

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
