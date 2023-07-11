SUMMARY = "Plugin for Psi"
DESCRIPTION = "Plugin to support GnuPG end-to-end encryption."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-openpgpplugin-1.5.1615+0-3.2.aarch64.rpm"
RPM_HASH = "80d46ba27764e930d06f4ffbe57a8bd1d5287b65199fbc8de15cd0882a45009b0d4b927500816c86259b196a05ae9cc4a47f0f1105232bef2afedb29c1ce83e1"

RPROVIDES:${PN} += "libopenpgpplugin.so \
plugins-gnupgplugin \
psi+-plugins-openpgpplugin"

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
