SUMMARY = "KDE scan library"
DESCRIPTION = "The KDE scanner library provides an API and widgets for using \
scanners and other imaging devices supported by SANE."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "23.08.0"

RPM_NAME = "libKF5Sane5-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "56226e0cc9c06209a4a2728b03338163d02d7576d8467b6096fd190b3fc97bdafe8d449feb1fff8e7a8446a7b1db46bc4adabecd61934a1420e8769ac35de96c"

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
