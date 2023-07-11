SUMMARY = "Qt-based GUI for sigrok"
DESCRIPTION = "The sigrok project aims at creating a portable, cross-platform, \
Free/Libre/Open-Source logic analyzer software that supports various \
logic analyzer hardware products. \
 \
PulseView is a Qt-based GUI for sigrok."
LICENSE = "GPL-3.0-or-later"

PV = "0.4.2"

RPM_NAME = "pulseview-0.4.2-3.17.aarch64.rpm"
RPM_HASH = "2113964b143cb92bb7a44a0d8f7dc800a1844cf1de63ce019ccb378920c3c8c8e88dba173008e770949650f591040407e6447f30de82d725856427fb9a072c3b"

RPROVIDES:${PN} += "pulseview"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libboost-filesystem.so.1.82.0 \
libboost-serialization.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libm.so.6 \
libsigrok.so.4 \
libsigrokcxx.so.4 \
libsigrokdecode.so.4 \
libstdc++.so.6"

inherit rpm
