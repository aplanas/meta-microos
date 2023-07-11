SUMMARY = "Plugin for Psi"
DESCRIPTION = "Off-the-Record (OTR) Messaging allows you to have private conversations over \
instant messaging."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-otrplugin-1.5.1615+0-3.2.aarch64.rpm"
RPM_HASH = "2d50ae6a2dfbffc3fcfe53106cb3f86807d6ed64cdd1eba32b0bffbb84761910465fc3eb73e86958184eec4a98e1997d8502bf8f08e07f8968d3f516b9c8790c"

RPROVIDES:${PN} += "libotrplugin.so \
psi+-plugins-otrplugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libgcrypt.so.20 \
libotr.so.5 \
libstdc++.so.6 \
libtidy.so.58 \
psi+"

inherit rpm
