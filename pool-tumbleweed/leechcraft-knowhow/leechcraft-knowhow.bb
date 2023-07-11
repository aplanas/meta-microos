SUMMARY = "LeechCraft 'Tip of the day' Module"
DESCRIPTION = "This package provides a tips plugin for LeechCraft which \
displays a 'tip of the day' window after launching LeechCraft."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-knowhow-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "da438eb753bbedd1337d96e62465bffcacdbef26e9a42eafe09c3218339555fd5e6955126efdc91cb8b1cfe75c2414e1d57cf0b9b40a9219ba7427e0cba4ff96"

RPROVIDES:${PN} += "leechcraft-knowhow \
libleechcraft-knowhow.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sys-qt5.so.0.6.75.1 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
