SUMMARY = "Plasma 5 version of ssh-askpass"
DESCRIPTION = "A Plasma 5 version of ssh-askpass with KWallet support."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "ksshaskpass5-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "63a8f05755c6e1c61d70db790d0ef588ae4d910cd092d4432b3cfdfd9ef25e0e33320f904687740bd67b25f5bcc1a3c926b58b2b67a40a2fab0b665a854ee4f0"

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
