SUMMARY = "GUI part of seafile drive"
DESCRIPTION = "This package provides a graphical user interface for seadrive-fuse"
LICENSE = "GPL-3.0-only"

PV = "2.0.25"

RPM_NAME = "seadrive-gui-2.0.25-1.5.aarch64.rpm"
RPM_HASH = "da1107ae95841d9182acea6a88d99a057d261360fca1ce25ede3940d4d343af16ad743f1b3ae967937de2b858db7930703d8ec0b4af10d38e0c3a4b2d75ae246"

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
