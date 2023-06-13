SUMMARY = "MySQL Module for ProFTPD"
DESCRIPTION = "This is the MySQL Module for ProFTPD"
LICENSE = "GPL-2.0-or-later"

PV = "1.3.7f"

RPM_NAME = "proftpd-mysql-1.3.7f-1.3.aarch64.rpm"
RPM_HASH = "1f7e4c9d2b72d7a390af5308a3a3276887c986e3ba5327f409e715e0e0fa58e438ad2e170951c9c0868a0cb5f5d08d004e117ef631ccae2c0a6f28b4c4bc958e"

RPROVIDES:${PN} += "proftpd-mysql \
proftpd-mysql(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libmariadb.so.3()(64bit) \
libmariadb.so.3(libmysqlclient_18)(64bit) \
proftpd"

inherit rpm
