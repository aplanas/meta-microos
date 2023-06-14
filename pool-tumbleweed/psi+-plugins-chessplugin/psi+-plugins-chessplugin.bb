SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin adds the chess game into Psi+."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-chessplugin-1.5.1615+0-3.1.aarch64.rpm"
RPM_HASH = "2e625cf37249fbfa3a9cbeb912bade2752dfc0a6bd977d17454fafb604b13426d91fe2ef2e3bf57cc46a0bac7935967cbc6670d1aea4498f64ce8cc145251638"

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
