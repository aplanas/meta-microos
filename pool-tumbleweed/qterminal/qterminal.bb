SUMMARY = "A Qt-based terminal emulator"
DESCRIPTION = "The lightweight Qt terminal emulator."
LICENSE = "GPL-2.0-only"

PV = "1.3.0"

RPM_NAME = "qterminal-1.3.0-1.1.aarch64.rpm"
RPM_HASH = "c77a4e5cd98fc1f0b3a50f47220a15dfd55dc48698971ac2c86f58f7bbf5fb565f5fbaaf4cc27d98a8e627e5efc93db104c807d0625e98e78ff745166b7a0875"

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
