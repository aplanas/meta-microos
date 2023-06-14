SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin is designed to create, store and apply skins to Psi."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-skinsplugin-1.5.1615+0-3.1.aarch64.rpm"
RPM_HASH = "77bbf6912046bd8c23d8656e6571a7a14c453c019d746f345dc05290c19ea8feb190c31fa57feed8b33ec22f836c562b60649d220435de9d71ca4aad42f7f464"

RPROVIDES:${PN} += "libskinsplugin.so \
psi+-plugins-skinsplugin"

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
