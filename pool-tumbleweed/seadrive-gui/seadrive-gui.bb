SUMMARY = "GUI part of seafile drive"
DESCRIPTION = "This package provides a graphical user interface for seadrive-fuse"
LICENSE = "GPL-3.0-only"

PV = "2.0.25"

RPM_NAME = "seadrive-gui-2.0.25-1.4.aarch64.rpm"
RPM_HASH = "a2c1ec5e3aefefd5f546c6b6dfa2247ffe1776342b5b9dad8b16b37e94d9d2e63f626715d0d089eba43f55f9df693fe1105003e726251dfb1d897b3b6e6941d7"

RPROVIDES:${PN} += "seadrive-gui"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjansson.so.4 \
libsearpc.so.1 \
libsqlite3.so.0 \
libstdc++.so.6 \
seadrive-fuse"

inherit rpm
