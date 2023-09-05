SUMMARY = "OTP client"
DESCRIPTION = "OTP client for Plasma Mobile and Desktop"
LICENSE = "GPL-3.0-or-later"

PV = "23.08.0"

RPM_NAME = "keysmith-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "a81c200af4b2af56ca064273b12e47c697c1e6f30ff2d709877c8e41dc53f454417dd2c85a913aaf68ea2b417661eaaf20150d4f0d0a8689ce98a214f7ad0095"

RPROVIDES:${PN} += "keysmith"

RDEPENDS:${PN} += "kirigami2 \
ld-linux-aarch64.so.1 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5WindowSystem.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5QuickControls2.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libsodium.so.23 \
libstdc++.so.6"

inherit rpm
