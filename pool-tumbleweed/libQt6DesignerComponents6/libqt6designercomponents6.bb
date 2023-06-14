SUMMARY = "Qt 6 DesignerComponents library"
DESCRIPTION = "The Qt 6 DesignerComponents library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "libQt6DesignerComponents6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "0aa7f0914b64eefed878913dc7cb7f82abf1bd13f2c75c0f789f825f693f7e24258d134e18f8f6b03cf66ee43909662eacfbf45dd9a0aeeab14730ae18bd8518"

RPROVIDES:${PN} += "libQt6DesignerComponents.so.6 \
libQt6DesignerComponents6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Designer.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
