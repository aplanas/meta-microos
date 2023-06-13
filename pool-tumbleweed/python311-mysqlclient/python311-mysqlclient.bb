SUMMARY = "Python interface to MySQL"
DESCRIPTION = "MySQLdb is an interface to the popular MySQL database server for Python. \
 \
This package adds Python 3 support and bug fixes to MySQLdb1."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.1"

RPM_NAME = "python311-mysqlclient-2.1.1-2.1.aarch64.rpm"
RPM_HASH = "2ddc3393b7ab21ad6c3cf954a533f2f42ddf1ff766cd1d28092ea6f74b73da7116933e89a48df68992ab1eee9bb6bde189a11716245e609c72806fab9a138fb3"

RPROVIDES:${PN} += "python3.11dist(mysqlclient) \
python311-MySQL-python \
python311-mysql \
python311-mysqlclient \
python311-mysqlclient(aarch-64) \
python3dist(mysqlclient)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libmariadb.so.3()(64bit) \
libmariadb.so.3(libmysqlclient_18)(64bit) \
python(abi)"

inherit rpm
