SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin allows you to convert selected text into another language."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-translateplugin-1.5.1615+0-3.1.aarch64.rpm"
RPM_HASH = "a5497269bc03ed4eda39da038476e04a17c9b7d373a120084eae763a77e48a7b95083a887767bfbcd7f9e11752428b3b241e08f7ca4ed49573d2d8da95db4a1f"

RPROVIDES:${PN} += "libtranslateplugin.so \
psi+-plugins-translateplugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
psi+"

inherit rpm
