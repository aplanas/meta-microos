SUMMARY = "Disk Usage Viewer"
DESCRIPTION = "KDE free disk space utility"
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kdf-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "4dc5b245a0c9163a92a26a5067ac8893100fdf6f64f34bd1598e7ad12f6112c6fcfd35004ff030fb4414a59fdf070be7388e4116bf7e63231116c89ba983fd4f"

RPROVIDES:${PN} += "kdf \
libkcm-kdf.so \
libkdfprivate.so.23"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5KIOCore.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
