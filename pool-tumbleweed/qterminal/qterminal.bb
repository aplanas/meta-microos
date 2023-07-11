SUMMARY = "A Qt-based terminal emulator"
DESCRIPTION = "The lightweight Qt terminal emulator."
LICENSE = "GPL-2.0-only"

PV = "1.3.0"

RPM_NAME = "qterminal-1.3.0-1.2.aarch64.rpm"
RPM_HASH = "63495627465710a3062aa125110a5c4785076aebce964bc2b0d9abae0d530226ba8dee314b06c264c843130814830c2642f82c50da81cf4923267a52fc1248ac"

RPROVIDES:${PN} += "qterminal"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libX11.so.6 \
libc.so.6 \
libqtermwidget5.so.1 \
libstdc++.so.6"

inherit rpm
