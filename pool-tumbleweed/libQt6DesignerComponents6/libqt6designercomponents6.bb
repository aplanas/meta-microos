SUMMARY = "Qt 6 DesignerComponents library"
DESCRIPTION = "The Qt 6 DesignerComponents library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "libQt6DesignerComponents6-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "a8e87e79c30e3633914feab065d581e38e004348102ebfdf7bcd53a42203910edfe951d83aaf40f3b9b9f38381e38cb00c73f4f5c1348f6513569ba9111b1f0d"

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
