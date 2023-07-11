SUMMARY = "LeechCraft Azoth Shell command runner Module"
DESCRIPTION = "This package provides a shell command runner plugin for LeechCraft Azoth."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-azoth-shx-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "4dc99a5a50dfec6e1d471d48ba95e4abbcd683766e38a889e0a27e27cacf823e3b2fd4c8182b15458fb667a672dcbc7cb55ffc8752f29f93eccd84b700b3ef47"

RPROVIDES:${PN} += "leechcraft-azoth-shx \
libleechcraft-azoth-shx.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-azoth \
libQt5Core.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
