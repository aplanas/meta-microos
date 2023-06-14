SUMMARY = "Qt 5 Charts Library"
DESCRIPTION = "Qt Charts module provides a set of chart components. It uses the Qt \
Graphics View Framework, therefore charts can be integrated to user \
interfaces. Qt Charts can be used as QWidgets, QGraphicsWidget, or \
QML types. Users can create graphs by selecting one of the charts \
themes. \
 \
This package contains a shared library for the QtChart."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.9+kde0"

RPM_NAME = "libQt5Charts5-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "009e8f8b2dc3baa9f6938ab4e365dbc185420d73f26c18a10042aa412396937c364a3dcc03640e0853bccb82ebb1ae315d7829881dc86801e90c0826a7cde319"

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
