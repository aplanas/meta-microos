SUMMARY = "Qt 5 Charts Library"
DESCRIPTION = "Qt Charts module provides a set of chart components. It uses the Qt \
Graphics View Framework, therefore charts can be integrated to user \
interfaces. Qt Charts can be used as QWidgets, QGraphicsWidget, or \
QML types. Users can create graphs by selecting one of the charts \
themes. \
 \
This package contains a shared library for the QtChart."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.10+kde0"

RPM_NAME = "libQt5Charts5-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "ff212cb96cca07cd4a22991f87b879505921f38641fd8365aa32804f5142d60078ace10365bb2fb6d0c44f6c59091cf69817bb5cf7414c5ad6b6d872318debf3"

RPROVIDES:${PN} += "libQt5Charts.so.5 \
libQt5Charts5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
