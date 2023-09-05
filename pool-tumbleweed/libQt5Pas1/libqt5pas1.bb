SUMMARY = "Free Pascal interface to Qt5"
DESCRIPTION = "Qt5 bindings for Pascal from Lazarus."
LICENSE = "LGPL-3.0-only"

PV = "2.2.6"

RPM_NAME = "libQt5Pas1-2.2.6-2.1.aarch64.rpm"
RPM_HASH = "b3380e999e644b53febe5109599c2d14fc4d3f5154f82e00135a860a1d35d926d6550a5dc5bcb6102b41d732e696315cd4f4bcaf249ba4c26b61e859c4d1e7da"

RPROVIDES:${PN} += "libQt5Pas.so.1 \
libQt5Pas1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
