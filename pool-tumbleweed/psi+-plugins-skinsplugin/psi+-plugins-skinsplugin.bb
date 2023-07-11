SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin is designed to create, store and apply skins to Psi."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-skinsplugin-1.5.1615+0-3.2.aarch64.rpm"
RPM_HASH = "8ff01b0132398b3b82bcb58a4e752dbb4275faf18aa13993ee3299d1b152cadd000195ee62deac1f785da03aa0c2737209dbbc5493cb0ed869f31e2dbaf3f14c"

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
