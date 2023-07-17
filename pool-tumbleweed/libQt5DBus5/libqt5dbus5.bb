SUMMARY = "Qt5 D-Bus library"
DESCRIPTION = "The Qt D-Bus module is a library that can be used to perform \
inter-process communication using the D-Bus protocol."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5DBus5-5.15.10+kde129-2.1.aarch64.rpm"
RPM_HASH = "6d9a271e9080097a53e9b9d76b67cdd8d45248bc208fdc5b2291c762574949022b9aed2b27064aa58f0da9922957295ec93e837e080b0aaef6066eda025ae254"

RPROVIDES:${PN} += "libQt5DBus.so.5 \
libQt5DBus5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libc.so.6 \
libdbus-1.so.3 \
libstdc++.so.6"

inherit rpm
