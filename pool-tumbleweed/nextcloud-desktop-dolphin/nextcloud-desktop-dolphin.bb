SUMMARY = "Dolphin overlay icons"
DESCRIPTION = "This package provides the necessary plugin libraries for the \
Dolphin filemanager to display overlay icons."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "3.9.3"

RPM_NAME = "nextcloud-desktop-dolphin-3.9.3-1.1.aarch64.rpm"
RPM_HASH = "341343ff4b07a9b6e4f0cbadb2d4f9e0ef49b949ee5d7171e1a67c456e52a6512a142a02a509aff4290bdfc9e904f49671f16236f0160ea2c19452ac076a9891"

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
