SUMMARY = "LeechCraft ToDo manager Module"
DESCRIPTION = "This package provides a GTD-inspired ToDo manager plugin for LeechCraft."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-otlozhu-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "2cfd5bbd0fecdb5723935a2e0338cda00f7ab26d0f73cba64784c7801c8918547bc4cf42e49f5276d61eec85dbbab9bf27bda3abea516275960b370dcd6c1760"

RPROVIDES:${PN} += "leechcraft-otlozhu \
libleechcraft-otlozhu.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-tags-qt5.so.0.6.75.1 \
libleechcraft-util-xpc-qt5.so.0.6.75.2 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
