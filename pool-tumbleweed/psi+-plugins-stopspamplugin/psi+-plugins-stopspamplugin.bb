SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin is designed to block spam messages and other unwanted information \
from Psi+ users."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-stopspamplugin-1.5.1615+0-3.1.aarch64.rpm"
RPM_HASH = "b30185705c80e43a4a6beef853f0a03a181f741e1eba2d46ce75eed205eeebc108efe4fbfe8d03a96c3fa05a98b4ba07b363c747e981d65783bd16984bf85eb6"

RPROVIDES:${PN} += "libstopspamplugin.so \
psi+-plugins-stopspamplugin"

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
