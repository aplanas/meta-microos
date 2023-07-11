SUMMARY = "QtCurve style for Qt and GTK+"
DESCRIPTION = "QtCurve is a set of widget styles available for Qt and GTK+. \
This package cointains library for common drawing routines."
LICENSE = "LGPL-2.1-or-later"

PV = "1.9.0"

RPM_NAME = "libqtcurve-cairo1-1.9.0-6.18.aarch64.rpm"
RPM_HASH = "b8e406862726459515dd65bf1e782e626cebe86835c906b778250bc71a40c570082d6c7195b09a328b04f387891615438cbaf0bb093d740d7760c0e9be39f514"

RPROVIDES:${PN} += "libqtcurve-cairo.so.1 \
libqtcurve-cairo1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libstdc++.so.6"

inherit rpm
