SUMMARY = "OSM opening hours expression parser and evaluator"
DESCRIPTION = "A library for parsing and evaluating OSM opening hours expressions."
LICENSE = "LGPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kopeninghours-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "e4eeef72888f4538da9dc8caa582c488b6de568a56dd61bc89b346a7528a6f7612c7292e1648a6d9f1d8b459a4b988e95f5583b5dcdde1ea77a90fbe6bfc4fd3"

RPROVIDES:${PN} += "kopeninghours \
libkopeninghoursqmlplugin.so \
qt5qmlimport-org.kde.kopeninghours.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKOpeningHours.so.1 \
libQt5Core.so.5 \
libQt5Qml.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
