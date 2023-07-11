SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin allows you to make screenshots and save them to your hard drive or \
upload them to an FTP or HTTP server."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-screenshotplugin-1.5.1615+0-3.2.aarch64.rpm"
RPM_HASH = "e5e4406ee125e14497049036c2c24d896becd7703d4ba9d4b87e9a5b86427e40a04bb893d5fafc8cef103ef6ce1be4df5e384894722f7f6a3e2e6b31f4e33d44"

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
