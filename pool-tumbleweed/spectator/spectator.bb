SUMMARY = "System tray that downloads and display info about the Turris router"
DESCRIPTION = "Spectator, systray tool to display various informations about the \
Turris router from CZ.nic"
LICENSE = "GPL-3.0+"

PV = "0.6+git74.9ef0de5"

RPM_NAME = "spectator-0.6+git74.9ef0de5-1.28.aarch64.rpm"
RPM_HASH = "6f822946ffa91928b4921069f5f24baf5f9ab056682202334f5a6f7ffb4138ab91ea57287314750f6d847dc935b4c00c0a25ea724e9016fe021ec3a9cc8b561a"

RPROVIDES:${PN} += "spectator"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libturris-spectator.so.0 \
openssl"

inherit rpm
