SUMMARY = "Development tools for Deepin Anything"
DESCRIPTION = "UDisks2 library with Qt5 \
 \
UDisks2 DBus interfaces binding of Qt5."
LICENSE = "LGPL-3.0+"

PV = "5.0.6"

RPM_NAME = "libudisks2-qt5-0-5.0.6-1.9.aarch64.rpm"
RPM_HASH = "e0bac644f18c875e6701136b6f037eb6c60dd1135cc59493eb7f3fb5e8141c7e67e95c1aca3b3dcece3bdddd0b89051bbb60fee657c083c4dca76a32cc9dec34"

RPROVIDES:${PN} += "libudisks2-qt5-0 \
libudisks2-qt5.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
