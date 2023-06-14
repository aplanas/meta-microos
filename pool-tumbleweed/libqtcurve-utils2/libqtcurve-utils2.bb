SUMMARY = "QtCurve style for Qt and GTK+"
DESCRIPTION = "QtCurve is a set of widget styles available for Qt and GTK+. \
This package cointains basic helper library needed for qtcurve."
LICENSE = "LGPL-2.1-or-later"

PV = "1.9.0"

RPM_NAME = "libqtcurve-utils2-1.9.0-6.16.aarch64.rpm"
RPM_HASH = "6eec9d7fe29cf1ba0f47de34db40875655b460dff25fd322a71cf9baa8b66091268731148148b2157c423d638cc10dd57e9d43abcf97a50aa90a18ac46d798db"

RPROVIDES:${PN} += "libqtcurve-utils.so.2 \
libqtcurve-utils2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11-xcb.so.1 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libxcb.so.1"

inherit rpm
