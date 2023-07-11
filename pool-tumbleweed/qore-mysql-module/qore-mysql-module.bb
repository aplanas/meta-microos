SUMMARY = "MySQL DBI module for Qore"
DESCRIPTION = "MySQL DBI driver module for the Qore Programming Language. The MySQL driver is \
character set aware and supports multithreading, transaction management, and \
stored procedure execution."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "2.1"

RPM_NAME = "qore-mysql-module-2.1-1.6.aarch64.rpm"
RPM_HASH = "4b012d9f44754c32b69aa57dc5d7372a38c05a7212e6a848495a24de0b402b504fd6baf961b63a19c3dbdb785cae2a1e117acadd75c3d8d2d15a9a58c68491cd"

RPROVIDES:${PN} += "qore-mysql-module"

RDEPENDS:${PN} += "/usr/bin/env \
libc.so.6 \
libgcc-s.so.1 \
libmariadb.so.3 \
libstdc++.so.6 \
qore-module-abi"

inherit rpm
