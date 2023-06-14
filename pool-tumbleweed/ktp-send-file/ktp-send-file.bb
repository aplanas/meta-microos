SUMMARY = "File manager plugin"
DESCRIPTION = "A File manager plugin to launch a file transfer job with a specified contact"
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "ktp-send-file-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "4b5872d247e4c68f95d38e91bc7762cee57f04ba1b5e6a945bc23c09c44f12a385282c55c0b747ebd1bb0be02dea75d5d73a0f199ac45b4cf1642b4e676284d0"

RPROVIDES:${PN} += "ktp-send-file \
ktp-send-file5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKTpCommonInternals.so.9 \
libKTpModels.so.9 \
libKTpWidgets.so.9 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6 \
libtelepathy-qt5.so.0"

inherit rpm
