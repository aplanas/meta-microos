SUMMARY = "LeechCraft ToDo manager Module"
DESCRIPTION = "This package provides a GTD-inspired ToDo manager plugin for LeechCraft."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-otlozhu-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "2cfd5bbd0fecdb5723935a2e0338cda00f7ab26d0f73cba64784c7801c8918547bc4cf42e49f5276d61eec85dbbab9bf27bda3abea516275960b370dcd6c1760"

RPROVIDES:${PN} += "leechcraft-otlozhu \
leechcraft-otlozhu(aarch-64) \
libleechcraft_otlozhu.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
leechcraft \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libleechcraft-util-qt5.so.0.6.75()(64bit) \
libleechcraft-util-tags-qt5.so.0.6.75.1()(64bit) \
libleechcraft-util-xpc-qt5.so.0.6.75.2()(64bit) \
libleechcraft-xsd-qt5.so.0.6.75.2()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
