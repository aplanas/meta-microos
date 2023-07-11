SUMMARY = "Qt 6 UiTools library"
DESCRIPTION = "This package contains the Qt 6 UiTools library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "libQt6UiTools6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "0fde862528315c21095b964e658a5bb2326b6462830b7fc26922a14b8c6e02a10724b59db498d1938690af82d29a0ad30e324f52633c65515a5c4213a02d1d3c"

RPROVIDES:${PN} += "libQt6UiTools.so.6 \
libQt6UiTools6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6OpenGLWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
