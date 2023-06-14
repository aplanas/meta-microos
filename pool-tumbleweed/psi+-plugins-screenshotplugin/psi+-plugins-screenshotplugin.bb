SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin allows you to make screenshots and save them to your hard drive or \
upload them to an FTP or HTTP server."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-screenshotplugin-1.5.1615+0-3.1.aarch64.rpm"
RPM_HASH = "4099c226d1521e3a4fd253c728a3b77a8e307f29a2e188915bb534977614368a68e51b0393ce83cb0e134e95aec31584bfabdd63a48c0fcd071b0ed67adfc000"

RPROVIDES:${PN} += "libscreenshotplugin.so \
psi+-plugins-screenshotplugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
psi+"

inherit rpm
