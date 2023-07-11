SUMMARY = "LeechCraft Azoth Module for publishing current user tune"
DESCRIPTION = "This package provides an Azoth plugin which allows to publish \
the current user tune."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-azoth-xtazy-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "cb395087cacc5ffb22f12779df1e413e6cdeb8c1ff91d93d6ccb97a885b226c657d2fa22e7febdd55247e245623f48720442535fff97f3411121eefba13d30cf"

RPROVIDES:${PN} += "leechcraft-azoth-xtazy \
libleechcraft-azoth-xtazy.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-azoth \
leechcraft-xtazy \
libQt5Core.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
