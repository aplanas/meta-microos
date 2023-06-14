SUMMARY = "A pump.io client written in C++/Qt"
DESCRIPTION = "Pumpa is a pump.io client written in C++ and Qt."
LICENSE = "GPL-3.0+"

PV = "0.9.3"

RPM_NAME = "pumpa-0.9.3-2.32.aarch64.rpm"
RPM_HASH = "9d0efa212a92132dbc4116c861970c4f623138f9698763c07ed71a0e6cc94e676240aa21c79bbb7580adb655b39c703a9ca40e2a114d78e2420ecbbb81ecd1e0"

RPROVIDES:${PN} += "pumpa"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libtidy.so.58"

inherit rpm
