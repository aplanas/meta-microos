SUMMARY = "QtCurve style for Qt and GTK+"
DESCRIPTION = "QtCurve is a set of widget styles available for Qt and GTK+. \
This package cointains library for common drawing routines."
LICENSE = "LGPL-2.1-or-later"

PV = "1.9.0"

RPM_NAME = "libqtcurve-cairo1-1.9.0-6.16.aarch64.rpm"
RPM_HASH = "70c02a6207c5a537c5ec16c50f71a769465279a35f70571c6c26d2a138ec266795c3159b67696cad2acf7f4eec268a96fea27d0b2869f4c4b52be858649dc4be"

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
