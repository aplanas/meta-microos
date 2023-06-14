SUMMARY = "Dolphin overlay icons"
DESCRIPTION = "This package provides the necessary plugin libraries for the KDE \
Framework 5 based Dolphin filemanager to display overlay icons."
LICENSE = "GPL-2.0-only & GPL-3.0-only"

PV = "3.2.0"

RPM_NAME = "owncloud-client-dolphin-3.2.0-2.3.aarch64.rpm"
RPM_HASH = "8e0f8b757974b5d19c9e153cffd2b3846e98306ea382aabf09997ba877a9dab5bb1a89bc5a59c8d108277caa89e5c0aafc8dae808f99620ec43f8323e5212a72"

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
