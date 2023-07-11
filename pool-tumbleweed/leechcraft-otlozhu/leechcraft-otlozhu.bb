SUMMARY = "LeechCraft ToDo manager Module"
DESCRIPTION = "This package provides a GTD-inspired ToDo manager plugin for LeechCraft."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-otlozhu-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "6aa3c4850d0244357d30223fd9c613e2596eab0a7cdb6d75a06f0b771d92ba7207bd67a6444467093dbb69018dcd3e81305f041f236593d389cedba3b6145c96"

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
