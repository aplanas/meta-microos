SUMMARY = "OSM opening hours expression parser and evaluator"
DESCRIPTION = "A library for parsing and evaluating OSM opening hours expressions."
LICENSE = "LGPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kopeninghours-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "93813d189204653833d76d98ab149eb9ed912f09d2decb05c7b9bde05125de16673bc8bda075f9450097dadbad9d94ab65833c844d76edaff111d8ed35c6341b"

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
