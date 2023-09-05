SUMMARY = "KDE Archiver Tool"
DESCRIPTION = "This is a KDE application to work with compressed archives."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "libkerfuffle23-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "442a3328f105b74a9806eb1a081f21e28d1104c7107f8452fd11a9ff81e9007cef23dce82aac11716ca1e19dfadf822263d6147437231808d07121c6b779f47a"

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
