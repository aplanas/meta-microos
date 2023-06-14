SUMMARY = "Modular Internet Client"
DESCRIPTION = "LeechCraft is a modular 'Internet client' application. \
 \
LeechCraft allows to browse the web, read RSS/Atom feeds, download \
files via BitTorrent, HTTP, FTP and DC, automatically stream, \
download or play podcasts and other media files and much more. \
 \
Features can be added via plugins that can be integrated with \
each other, while staying abstract from the exact implementation. \
 \
This package contains the main LeechCraft executable, which connects \
all the plugins with each other, routes requests between them, tracks \
dependencies and performs several other housekeeping tasks."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "8757949ca0e63aa20ab8edcd5c7e1063528ffca4af23b642eac40aac85c41040fa1fe65d11151c10004c213f152e1e26b24edab68c22536bbe90a9babbf7dc5a"

RPROVIDES:${PN} += "leechcraft \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-xsd-qt5.so.0.6.75.2"

RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Concurrent.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Script.so.5 \
libQt5Sql.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libQt5Xml.so.5 \
libX11.so.6 \
libboost-program-options.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-db-qt5.so.0.6.75.1 \
libleechcraft-util-gui-qt5.so.0.6.75.1 \
libleechcraft-util-network-qt5.so.0.6.75.1 \
libleechcraft-util-qml-qt5.so.0.6.75.2 \
libleechcraft-util-shortcuts-qt5.so.0.6.75 \
libleechcraft-util-sll-qt5.so.0.6.75.1 \
libleechcraft-util-sys-qt5.so.0.6.75.1 \
libleechcraft-util-tags-qt5.so.0.6.75.1 \
libleechcraft-util-xpc-qt5.so.0.6.75.2 \
libstdc++.so.6 \
oxygen-icon-theme \
qt5qmlimport-QtQuick.2"

inherit rpm
