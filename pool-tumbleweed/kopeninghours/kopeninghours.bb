SUMMARY = "OSM opening hours expression parser and evaluator"
DESCRIPTION = "A library for parsing and evaluating OSM opening hours expressions."
LICENSE = "LGPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kopeninghours-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "2e27f5992d4fca6f4bc0e9510d8086d41c7420836e51d01679c5ddbf68453f997b6f629e5ec98f6fe77565b631937e3aff7f6506f79fa2b3d9df12e29daf91a9"

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
