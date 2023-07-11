SUMMARY = "Qt5 interface module for ZLibrary"
DESCRIPTION = "This package provides a Qt5-based UI for ZLibrary."
LICENSE = "GPL-2.0+"

PV = "0.99.4"

RPM_NAME = "libzlui0_99-0.99.4-3.28.aarch64.rpm"
RPM_HASH = "eb23073350f72964e50a37292f13aba81ea6d840c21829fb88c165cd0c5f36c9793637771051989cd912fa33b4ced040e745a4ae496c3e1d90b2c13b9901e396"

RPROVIDES:${PN} += "libzlui.so.0.99 \
libzlui0-99 \
zlibrary-ui"

RDEPENDS:${PN} += "/sbin/ldconfig \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6 \
libzlcore.so.0.99 \
zlibrary-data"

inherit rpm
