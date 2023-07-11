SUMMARY = "Disk Usage Viewer"
DESCRIPTION = "KDE free disk space utility"
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kdf-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "025166e9cf7f6708b71c88a02d369b1bc081c40c6c873d7831f9ed176cd39812586a2e888772cacac5be5eff4bc58952c248c8140dc78958cae83e29afa065da"

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
