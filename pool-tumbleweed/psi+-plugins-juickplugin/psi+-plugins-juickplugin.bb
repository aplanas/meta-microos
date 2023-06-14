SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin is designed to work efficiently and comfortably with the Juick \
microblogging service."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-juickplugin-1.5.1615+0-3.1.aarch64.rpm"
RPM_HASH = "ca2177f477a41a7b1cb11532e4abbc7b39a9c005f402bae523347f885d44718c5c57f5394cf6f16be3f579b6f21fa9df7151ef48de9fa907c8009200e2b87a1b"

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
