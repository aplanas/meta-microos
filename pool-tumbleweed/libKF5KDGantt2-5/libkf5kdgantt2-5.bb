SUMMARY = "Gantt chart library for kdepim"
DESCRIPTION = "This library implements Gantt chart drawing functionality. It allows \
to easily embed the Gantt charts into the application as long as it \
is capable of drawing QWidget or QGraphicsView objects."
LICENSE = "LGPL-2.1-or-later"

PV = "16.08.3"

RPM_NAME = "libKF5KDGantt2-5-16.08.3-4.16.aarch64.rpm"
RPM_HASH = "49342479301aed68e6befa97438f13a4d559a416d4c55f8facd1846176e33b684724596e4440db3105660f98569538131fa37ed9d9b53d2fee75578578d92dc2"

RPROVIDES:${PN} += "libKF5KDGantt2-5 \
libKF5KDGantt2.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
kdgantt2 \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
