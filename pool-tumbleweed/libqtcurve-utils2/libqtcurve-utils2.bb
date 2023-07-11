SUMMARY = "QtCurve style for Qt and GTK+"
DESCRIPTION = "QtCurve is a set of widget styles available for Qt and GTK+. \
This package cointains basic helper library needed for qtcurve."
LICENSE = "LGPL-2.1-or-later"

PV = "1.9.0"

RPM_NAME = "libqtcurve-utils2-1.9.0-6.18.aarch64.rpm"
RPM_HASH = "ce986204f4bd120aca3dea34f1746334081b9f4c8095da1e53294be7645fcce733ffe41c0cecaf1374eb2fba7e0a85b86eff07ddd39cdc0ece80398d955f3ba1"

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
