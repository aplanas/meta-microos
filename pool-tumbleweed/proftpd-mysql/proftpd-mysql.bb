SUMMARY = "MySQL Module for ProFTPD"
DESCRIPTION = "This is the MySQL Module for ProFTPD"
LICENSE = "GPL-2.0-or-later"

PV = "1.3.7f"

RPM_NAME = "proftpd-mysql-1.3.7f-1.4.aarch64.rpm"
RPM_HASH = "8517e5981ff47f3c749ac6d19d4db197a996c20589d11bdaf5681319d8baeeeca4a8075dc73113cefd3043f72e71098577734bb531ae1c99c2aa39039fe8692f"

RPROVIDES:${PN} += "proftpd-mysql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmariadb.so.3 \
proftpd"

inherit rpm
