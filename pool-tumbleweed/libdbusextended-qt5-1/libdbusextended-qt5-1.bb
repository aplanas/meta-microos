SUMMARY = "Qtdbusextended libraries"
DESCRIPTION = "This package contains the libraries for qtdbusextended"
LICENSE = "LGPL-2.1+"

PV = "0.0.3"

RPM_NAME = "libdbusextended-qt5-1-0.0.3-1.9.aarch64.rpm"
RPM_HASH = "5aec344a1e1b17ff693307c47ea3fb853c5e82f72c2432c575056f24ced95d2ada5cbca79592eda0f039e08892eea7a049d1aba3ab0eeae4558f92bb2aecb529"

RPROVIDES:${PN} += "libdbusextended-qt5-1 \
libdbusextended-qt5.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
