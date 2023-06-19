SUMMARY = "Qt 6 UiTools library"
DESCRIPTION = "This package contains the Qt 6 UiTools library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "libQt6UiTools6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "e1f9f7cd5f086f71075824eb00cd6c4426c0a9b016890f338619462fec1bb980a585f97c4903d12d74216b5a20c324a12ee3f60130bbbcc0efc2ee0a22b63549"

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
