SUMMARY = "Dolphin overlay icons"
DESCRIPTION = "This package provides the necessary plugin libraries for the KDE \
Framework 5 based Dolphin filemanager to display overlay icons."
LICENSE = "GPL-2.0-only & GPL-3.0-only"

PV = "4.2.0"

RPM_NAME = "owncloud-client-dolphin-4.2.0-1.1.aarch64.rpm"
RPM_HASH = "a021d7a1b9790a5c022c0d7ab0430540a832ba953fe21dc0c1d5127b361286529e4dbfdc1f3e5cc55b3f9d727bf924d617a7f3e47c725d205ec6d7bc07b67a02"

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
