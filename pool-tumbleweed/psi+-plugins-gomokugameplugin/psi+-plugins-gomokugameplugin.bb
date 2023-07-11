SUMMARY = "Plugin for Psi"
DESCRIPTION = "Plugin to add Gomoku game to Psi+."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-gomokugameplugin-1.5.1615+0-3.2.aarch64.rpm"
RPM_HASH = "eedd446819acf6d2fdda0b16597252bd3f988569982b2e1219f6e091837893b3fe026710ba7ddaf983df3748ff4659d9b35bfbda08544f2cf81f8ac813692797"

RPROVIDES:${PN} += "libgomokugameplugin.so \
psi+-plugins-gomokugameplugin"

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
