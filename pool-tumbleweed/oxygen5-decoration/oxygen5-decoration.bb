SUMMARY = "Oxygen's KWin decoration"
DESCRIPTION = "This package contains the libraries Oxygen's KWin decoration."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.7"

RPM_NAME = "oxygen5-decoration-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "90e453a755385dbd579a46ff156aea4ddc102b6e31ab0c1548bac52d1812b10dff2803b79f7792b4260c1aa51ac681384baffc5c3eb7ad5b17db5c8970e7edb2"

RPROVIDES:${PN} += "oxygen-decoration5 \
oxygen5-decoration"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5GuiAddons.so.5 \
libKF5I18n.so.5 \
libKF5WindowSystem.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libc.so.6 \
libkdecorations2.so.5 \
liboxygenstyle5.so.5 \
liboxygenstyleconfig5.so.5 \
libstdc++.so.6 \
libxcb.so.1"

inherit rpm
