SUMMARY = "Qtmpris libraries"
DESCRIPTION = "This package contains the libraries for qtmpris"
LICENSE = "LGPL-2.1+"

PV = "1.0.6"

RPM_NAME = "libmpris-qt5-1-1.0.6-2.7.aarch64.rpm"
RPM_HASH = "68a2b713cd3b7b211989be2c7e816718e640bd316a7aa1bd102d02865305cf1ff6fdd02990c0902ed0c154e8430ecd7dc9060d6a41ac990e03c48432d7cfe2bc"

RPROVIDES:${PN} += "libmpris-qt5-1 \
libmpris-qt5.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
