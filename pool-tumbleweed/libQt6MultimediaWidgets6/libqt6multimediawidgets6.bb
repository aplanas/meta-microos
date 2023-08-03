SUMMARY = "Qt 6 MultimediaWidgets library"
DESCRIPTION = "The Qt 6 MultimediaWidgets library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "libQt6MultimediaWidgets6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "54157d1b319e785c8cbf6de38d03593f6981438e37d9aa5570e1f527d9826416b23e7ce67a72379979f3396038dd816f04ee2a437aa78c1b44742de197e74ece"

RPROVIDES:${PN} += "libQt6MultimediaWidgets.so.6 \
libQt6MultimediaWidgets6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
