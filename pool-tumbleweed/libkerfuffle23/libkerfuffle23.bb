SUMMARY = "KDE Archiver Tool"
DESCRIPTION = "This is a KDE application to work with compressed archives."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "libkerfuffle23-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "a0d3ee35fca0a0a52bfca3c5de8c82e03af809e1ca3a44ff057824109ae89dacd9a9b6475ea2f1abdbe636011103ad22d209717ab252b68b93078c6d5210a4cf"

RPROVIDES:${PN} += "libkerfuffle.so.23 \
libkerfuffle23"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOFileWidgets.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Pty.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
