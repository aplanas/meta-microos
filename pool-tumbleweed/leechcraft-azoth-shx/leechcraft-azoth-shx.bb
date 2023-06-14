SUMMARY = "LeechCraft Azoth Shell command runner Module"
DESCRIPTION = "This package provides a shell command runner plugin for LeechCraft Azoth."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-azoth-shx-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "17878d2db5d3c694024d13dfdd60b995db7a09656baf6cc9250940b95a4b73d8c222b3a058ce392f4645c31461d4ecb651938741318116cf83ac482f653bc353"

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
