SUMMARY = "Display gamma configuration"
DESCRIPTION = "This package contains a KDE system settings module to configure display \
gamma."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "kgamma5-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "694523cccba2a55fc0b7f9cc83b81a875ffb077a5b16a7200a9b36fc93c0b3f5a1e412fb6b1c5459ba2f1ae72b30454bc2a6decd6ead042001d44f0e9673636c"

RPROVIDES:${PN} += "kgamma \
kgamma5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libX11.so.6 \
libXxf86vm.so.1 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
