SUMMARY = "LeechCraft Network Monitor Module"
DESCRIPTION = "This package provides another Network Monitor plugin for Leechcraft."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-lemon-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "0c176cf62bcf5cecc808bf8dda1042b90795952f95889f111a66763d4eb765a3a6ddcbbbbcc02bc7eb8abfa107611df67cf46eb91106e64e22d7f1134ae82518"

RPROVIDES:${PN} += "leechcraft-lemon \
libleechcraft-lemon.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
leechcraft-sb \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-gui-qt5.so.0.6.75.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sys-qt5.so.0.6.75.1 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libnl-3.so.200 \
libnl-route-3.so.200 \
libqwt-qt5.so.6.2 \
libstdc++.so.6 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Window.2"

inherit rpm
