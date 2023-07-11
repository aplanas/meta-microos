SUMMARY = "Gantt chart library"
DESCRIPTION = "This library implements Gantt chart drawing functionality. It allows \
to easily embed the Gantt charts into the application as long as it \
is capable of drawing QWidget or QGraphicsView objects. \
 \
This package is part of the KDE PIM module."
LICENSE = "GPL-2.0-only"

PV = "16.08.3"

RPM_NAME = "kdgantt2-16.08.3-4.17.aarch64.rpm"
RPM_HASH = "b4eb8da446bd2a5e9778dd3e789ed2d4b6d05b39f70186c6bb77d7ed81f5ca4a452c262db249b08e539f3223ec0e4a9f1337b97f493876a41d6c99233f6217f6"

RPROVIDES:${PN} += "kdgantt2"

RDEPENDS:${PN} += ""

inherit rpm
