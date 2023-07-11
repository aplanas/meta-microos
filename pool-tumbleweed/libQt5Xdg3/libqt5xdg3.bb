SUMMARY = "Libraries for qtxdg"
DESCRIPTION = "QtXDG libraries for development"
LICENSE = "GPL-3.0-only"

PV = "3.11.0"

RPM_NAME = "libQt5Xdg3-3.11.0-1.3.aarch64.rpm"
RPM_HASH = "c8ac61eefa8dcd7ba70d41b2ff83ed39bf3d8bda3ce2ca3e65323d5edb1f1049353c7f9a27e497cbda5086b63e4ec9e04b99e60d0fde9c3b808eb51a1a84019f"

RPROVIDES:${PN} += "config-libQt5Xdg3 \
libQt5Xdg.so.3 \
libQt5Xdg3 \
libqtxdg"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5XdgIconLoader.so.3 \
libQt5Xml.so.5 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libstdc++.so.6"

inherit rpm
