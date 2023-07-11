SUMMARY = "Dolphin overlay icons"
DESCRIPTION = "This package provides the necessary plugin libraries for the \
Dolphin filemanager to display overlay icons."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "3.9.0"

RPM_NAME = "nextcloud-desktop-dolphin-3.9.0-3.1.aarch64.rpm"
RPM_HASH = "9268fdf10dfce0557f3c5f42f302fb78717b7c51721bef9adf82699717ed76a1bd781a9918f92470f7ca2217d7611d2a9de2a56bf14e6ad0fa7785124e006799"

RPROVIDES:${PN} += "libnextclouddolphinpluginhelper.so \
nextcloud-desktop-dolphin"

RDEPENDS:${PN} += "dolphin \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOWidgets.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6 \
nextcloud-desktop"

inherit rpm
