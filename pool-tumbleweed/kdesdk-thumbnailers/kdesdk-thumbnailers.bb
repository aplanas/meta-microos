SUMMARY = "Translation file thumbnail generators"
DESCRIPTION = "This package allows KDE applications to show thumbnails \
and previews of po files."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kdesdk-thumbnailers-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "233deff3db566796b3315a855038579161712826ff0de84e89b8c5c679e11583547755de2d3ab2c8898a0f99a1a34f94077d46c949fe269b4f1e326f4244a22a"

RPROVIDES:${PN} += "kdesdk-thumbnailers"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5I18n.so.5 \
libKF5KIOWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgettextpo.so.0 \
libstdc++.so.6"

inherit rpm
