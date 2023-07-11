SUMMARY = "KDE scan library"
DESCRIPTION = "The KDE scanner library provides an API and widgets for using \
scanners and other imaging devices supported by SANE."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "23.04.3"

RPM_NAME = "libKF5Sane5-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "21de71f644b5c4833554c09d3413def81d1d22a9e80d93c7efc0365f8fdb3a54abd5f53cc5d047852112df102a8fdc21a820703cdd8522ab331271af8d701bbd"

RPROVIDES:${PN} += "libKF5Sane.so.5 \
libKF5Sane5 \
libksane"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5I18n.so.5 \
libKF5TextWidgets.so.5 \
libKF5Wallet.so.5 \
libKF5WidgetsAddons.so.5 \
libKSaneCore.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
