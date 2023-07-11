SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin is designed to clear the avatar cache, saved local copies of vCards \
and history logs."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-cleanerplugin-1.5.1615+0-3.2.aarch64.rpm"
RPM_HASH = "82f2559ae4577ddcc616feb30d8f259e134ac5d11375a3b331d1f4cde969b923400666827d36ad5122aaa79a0b58b118dad74259720a6391e704258fc5f1dc21"

RPROVIDES:${PN} += "libcleanerplugin.so \
psi+-plugins-cleanerplugin"

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
