SUMMARY = "DBD driver for MySQL"
DESCRIPTION = "DBD driver for MySQL database."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.3"

RPM_NAME = "libapr-util1-0-dbd-mysql-1.6.3-1.3.aarch64.rpm"
RPM_HASH = "5a0c67eb0fb1affd7467adb90cd2f58b0ab6d9ad137db8795e7620dc007bfffe1238a47b6815a22194a492c28754219cc96c42155b0be60b7cb7b865da1d6f5d"

RPROVIDES:${PN} += "libapr-util1-0-dbd-mysql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libapr-util1-0 \
libc.so.6 \
libmariadb.so.3"

inherit rpm
