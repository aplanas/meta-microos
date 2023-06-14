SUMMARY = "Qt5 interface module for ZLibrary"
DESCRIPTION = "This package provides a Qt5-based UI for ZLibrary."
LICENSE = "GPL-2.0+"

PV = "0.99.4"

RPM_NAME = "libzlui0_99-0.99.4-3.27.aarch64.rpm"
RPM_HASH = "09856cca4407cfac29571a3f99f055fa520f2800de72a1494e04a5bacb474203eba14638ad91f19898c792338c921405fda34b956a69a36370f25e26746c7e31"

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
