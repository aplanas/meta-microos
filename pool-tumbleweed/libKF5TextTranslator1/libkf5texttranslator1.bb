SUMMARY = "Text translation library"
DESCRIPTION = "This package provides a library for automated text translation."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.1"

RPM_NAME = "libKF5TextTranslator1-1.4.1-1.1.aarch64.rpm"
RPM_HASH = "8b4ed0c6fe09efee3d901bf21d607757a5a8e46dd128e71a84770dc228bc8555d84c8f7ffd38474d8873082786a61056a8c710ef3d7e61151c3f08967bd0946a"

RPROVIDES:${PN} += "libKF5TextTranslator.so.1 \
libKF5TextTranslator1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5I18n.so.5 \
libKF5TextAddonsWidgets.so.1 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
