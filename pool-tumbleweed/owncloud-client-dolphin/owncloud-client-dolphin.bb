SUMMARY = "Dolphin overlay icons"
DESCRIPTION = "This package provides the necessary plugin libraries for the KDE \
Framework 5 based Dolphin filemanager to display overlay icons."
LICENSE = "GPL-2.0-only & GPL-3.0-only"

PV = "4.1.0"

RPM_NAME = "owncloud-client-dolphin-4.1.0-1.1.aarch64.rpm"
RPM_HASH = "40261a88be71efe102a07acd491fcf856f174d5214b0b91140ad8795d13bb7ac49bba32bb3bb6b9f71f07acc8a0bdbee28f56331c51b8cf33c22932f00271bc5"

RPROVIDES:${PN} += "libownclouddolphinpluginhelper.so \
owncloud-client-dolphin"

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
owncloud-client"

inherit rpm
