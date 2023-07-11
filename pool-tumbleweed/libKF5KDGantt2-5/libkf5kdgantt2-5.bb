SUMMARY = "Gantt chart library for kdepim"
DESCRIPTION = "This library implements Gantt chart drawing functionality. It allows \
to easily embed the Gantt charts into the application as long as it \
is capable of drawing QWidget or QGraphicsView objects."
LICENSE = "LGPL-2.1-or-later"

PV = "16.08.3"

RPM_NAME = "libKF5KDGantt2-5-16.08.3-4.17.aarch64.rpm"
RPM_HASH = "6014d4ea05dd5c7cfc2207278dbf8091beee96040559b5138be9e0d08a279be74381578924f8c2d40799e33e58bd1784edf2b7870244fcb0c8b65acc883d471d"

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
