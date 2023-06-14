SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin shows the preview image for an image URL."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-imagepreviewplugin-1.5.1615+0-3.1.aarch64.rpm"
RPM_HASH = "e5bef62cfa8bd257b665e679587bef7602c22d18f4f48b43cd9aab6ddfeebf134f4dafe9d6f8118174f6fec39c008df4877677bff0fad43e13118d3d4b1d5ec1"

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
