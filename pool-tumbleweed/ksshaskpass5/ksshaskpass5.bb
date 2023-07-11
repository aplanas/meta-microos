SUMMARY = "Plasma 5 version of ssh-askpass"
DESCRIPTION = "A Plasma 5 version of ssh-askpass with KWallet support."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.6"

RPM_NAME = "ksshaskpass5-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "bef0d1cf044895c41c7b8cbbc1107c119295b7a55a6c1951218eabcf41fc7929f2aa820677abc835448a39f15e1e488817cbdf073eb137214b3402c5add25cfd"

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
