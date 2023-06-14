SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin is designed to remove the history of selected contacts when the Psi+ \
is closed."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-historykeeperplugin-1.5.1615+0-3.1.aarch64.rpm"
RPM_HASH = "b46230bf86e4158822f6904e91c6722a9fab434492d65b897a145222f983a8b5b4e31c2f23c45c07f46f4e361a7250b97817275e3fd861e6006ff5e99d7ce400"

RPROVIDES:${PN} += "libhistorykeeperplugin.so \
psi+-plugins-historykeeperplugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
psi+"

inherit rpm
