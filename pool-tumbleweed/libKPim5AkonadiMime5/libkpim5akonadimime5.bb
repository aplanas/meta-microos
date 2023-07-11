SUMMARY = "MIME email parser for KDE PIM - core library"
DESCRIPTION = "This package contains the core libraries needed for the correct parsing of email \
messages."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "libKPim5AkonadiMime5-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "616af9c352c5c046410e82848d441a8179eccfbbf9c9e5f7a5c7b9029c0473d058993927f62f44c90f333a4f207af59de1fc41cac05958c12c4d3323e93df60f"

RPROVIDES:${PN} += "libKPim5AkonadiMime.so.5 \
libKPim5AkonadiMime5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libKPim5AkonadiCore.so.5 \
libKPim5AkonadiWidgets.so.5 \
libKPim5Mime.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
