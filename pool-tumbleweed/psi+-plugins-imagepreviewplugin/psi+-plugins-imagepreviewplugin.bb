SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin shows the preview image for an image URL."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-imagepreviewplugin-1.5.1615+0-3.2.aarch64.rpm"
RPM_HASH = "f56ecbff3d21ac57470bc4c5c3e77f8dfd1bbca5d237cc9fbc123960c9cb6b416ae142030e9bee72385990b22c1ad8f120fd97b013143bddcff00453cc8206b2"

RPROVIDES:${PN} += "libimagepreviewplugin.so \
psi+-plugins-imagepreviewplugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
psi+"

inherit rpm
