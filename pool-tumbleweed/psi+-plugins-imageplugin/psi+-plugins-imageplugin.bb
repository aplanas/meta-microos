SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin is designed to send images to roster contacts."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-imageplugin-1.5.1615+0-3.2.aarch64.rpm"
RPM_HASH = "87cb5186a3285167d9e9395522a27a8cddc179d8580ec80ce18bb7e44b69faff90b0f4fbcd6571b8f51ffb7cc7d3fad77dd5ada93f6acd109b2e12a77e8df431"

RPROVIDES:${PN} += "libimageplugin.so \
psi+-plugins-imageplugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
psi+"

inherit rpm
