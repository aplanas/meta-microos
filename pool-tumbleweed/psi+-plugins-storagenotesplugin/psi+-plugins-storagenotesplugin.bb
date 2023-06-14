SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin is an implementation of XEP-0049: Private XML Storage."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-storagenotesplugin-1.5.1615+0-3.1.aarch64.rpm"
RPM_HASH = "25d2e5bd5b27acba69c86940720fc3c7027904fc72ba38cabb5e7248d96d08dbda01e2c253f094f60a858ba34d7b95caeed61df82e565aea9b69d2d0b9a47e0a"

RPROVIDES:${PN} += "libstoragenotesplugin.so \
psi+-plugins-storagenotesplugin"

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
