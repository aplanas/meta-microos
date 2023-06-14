SUMMARY = "Plugin for Psi"
DESCRIPTION = "Off-the-Record (OTR) Messaging allows you to have private conversations over \
instant messaging."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-otrplugin-1.5.1615+0-3.1.aarch64.rpm"
RPM_HASH = "f7ff9955921eb4c53cc02e23901a628459423f77d6d61c5c0a7e2de6581def6a75bd92bef5a8dff3bb6ac4178f2451d3a1282cef1b2840dd5e8d0ac95c618dee"

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
