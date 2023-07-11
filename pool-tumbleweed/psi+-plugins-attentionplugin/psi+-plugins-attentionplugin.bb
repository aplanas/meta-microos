SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin is designed to send and receive special messages such as Attentions."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-attentionplugin-1.5.1615+0-3.2.aarch64.rpm"
RPM_HASH = "b114f8a148114da35e3025b9f4f5e61385c9346fe28e2146bd6fe9c8a7388ae0faf3fa6211f87a64d8cb70e56c7e89f49fb5e503206f42b9a4acd6dbacd97f9a"

RPROVIDES:${PN} += "libattentionplugin.so \
psi+-plugins-attentionplugin"

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
