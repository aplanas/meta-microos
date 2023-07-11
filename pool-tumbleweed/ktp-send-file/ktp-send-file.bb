SUMMARY = "File manager plugin"
DESCRIPTION = "A File manager plugin to launch a file transfer job with a specified contact"
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "ktp-send-file-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "aa474513128e0c50d3a5497b61caaee4692f5a6f71c44fffac6ac2155dab692c24ee4d8a75c33a8afa6d45b91afa5ca25ca47c7c998799aa163e2918e37fbd1f"

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
