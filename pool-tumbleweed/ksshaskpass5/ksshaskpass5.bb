SUMMARY = "Plasma 5 version of ssh-askpass"
DESCRIPTION = "A Plasma 5 version of ssh-askpass with KWallet support."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.7"

RPM_NAME = "ksshaskpass5-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "12a84eae53787e60ed84b5cae961f4ffd2f4f75037d06e5cb7b25f5f54cfe403394bca713225a3409c8260cfd03a8cc30e4a052c2b10593b230f8911cf7b456a"

RPROVIDES:${PN} += "ksshaskpass \
ksshaskpass5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5Wallet.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
