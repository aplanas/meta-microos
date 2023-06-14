SUMMARY = "Dolphin overlay icons"
DESCRIPTION = "This package provides the necessary plugin libraries for the \
Dolphin filemanager to display overlay icons."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "3.8.2"

RPM_NAME = "nextcloud-desktop-dolphin-3.8.2-1.1.aarch64.rpm"
RPM_HASH = "d6a1d54dd0508e30083af944787bf0390199b5a5f48fc585e9556caa92aae16ab0375aba84bad6b17f1718e8009322cfd5a15f4fc156505b1b8a5dcbe59c3af4"

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
