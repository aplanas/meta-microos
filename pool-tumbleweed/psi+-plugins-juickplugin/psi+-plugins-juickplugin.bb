SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin is designed to work efficiently and comfortably with the Juick \
microblogging service."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-juickplugin-1.5.1615+0-3.2.aarch64.rpm"
RPM_HASH = "c89b1d9067b932d81130ea3ba4a5cc7f8b863296a1ba3f788564178c59f6fd450fd932998cd2354dd4dbbc6d25cd86bb3a2b282ea2438ecf3eb3398ce8acbc42"

RPROVIDES:${PN} += "libjuickplugin.so \
psi+-plugins-juickplugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
psi+"

inherit rpm
