SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin is designed to remove the history of selected contacts when the Psi+ \
is closed."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-historykeeperplugin-1.5.1615+0-3.2.aarch64.rpm"
RPM_HASH = "1289644bfd439847322b9f6bc2f88e2cce7cfe627431734213be0715de3847cf8f7ba35fee56f8468d1d7f59ec55c9e178aec19ffb3c4e03cdd9545ac5610199"

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
