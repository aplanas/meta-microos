SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin adds the chess game into Psi+."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-chessplugin-1.5.1615+0-3.2.aarch64.rpm"
RPM_HASH = "9e6f466f80f6cfa9f9f45238ada078e50a007d8a90955c0589639261e07d49a46b128e012905917ce3ec2c2e7a68665e93f66aa89d2336e3612c8b827993b294"

RPROVIDES:${PN} += "libchessplugin.so \
psi+-plugins-chessplugin"

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
