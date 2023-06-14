SUMMARY = "DBD driver for MySQL"
DESCRIPTION = "DBD driver for MySQL database."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.3"

RPM_NAME = "libapr-util1-0-dbd-mysql-1.6.3-1.2.aarch64.rpm"
RPM_HASH = "4e9846c22f3820089c0ca96ea54849374702fcb1248a8f685dacd81f3b0ee4d520af6af03f0b67b716a67a22f2290999807c3714c49f48108d829fd570ae4b32"

RPROVIDES:${PN} += "libapr-util1-0-dbd-mysql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libapr-util1-0 \
libc.so.6 \
libmariadb.so.3"

inherit rpm
