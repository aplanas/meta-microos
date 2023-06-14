SUMMARY = "KDE scan library"
DESCRIPTION = "The KDE scanner library provides an API and widgets for using \
scanners and other imaging devices supported by SANE."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "23.04.1"

RPM_NAME = "libKF5Sane5-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "bc2ff3647d628a5d6b7efcf179e97dae7b1509f19675379da6e23dd2a12663e5cd540aef842fc9c53b75b8022cb00979b00738d16e0a45cf7e1c57630e2241d5"

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
