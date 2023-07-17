SUMMARY = "Qt 6 UiTools library"
DESCRIPTION = "This package contains the Qt 6 UiTools library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "libQt6UiTools6-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "a9f17eadcb123790e8b19502e6e41229d74864862e6828436d3039b00758e14304b2c2096ad6aae0ca57913bcb40ad873aaae03306282de11b110659464ed1e8"

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
