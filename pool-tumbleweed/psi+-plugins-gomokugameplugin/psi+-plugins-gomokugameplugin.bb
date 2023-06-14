SUMMARY = "Plugin for Psi"
DESCRIPTION = "Plugin to add Gomoku game to Psi+."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-gomokugameplugin-1.5.1615+0-3.1.aarch64.rpm"
RPM_HASH = "f611293fecccca2b26ac7ed46792eba5ef88997aa9a2630101e2c43a4cb7f2897438a73be96b1fc608d77cce804ef928fb960acbc1a709dc52b402c4183dead9"

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
