SUMMARY = "Python interface to MySQL"
DESCRIPTION = "MySQLdb is an interface to the popular MySQL database server for Python. \
 \
This package adds Python 3 support and bug fixes to MySQLdb1."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.1"

RPM_NAME = "python39-mysqlclient-2.1.1-2.1.aarch64.rpm"
RPM_HASH = "354f1473cc9dbc02f084f606a5d452bc0eb40f786222a505f499e9f72666992781e7545fc82321ca33e26ae8c8cf522ec31779d07ef0865b7f263785766e0c5a"

RPROVIDES:${PN} += "python3.9dist(mysqlclient) \
python39-MySQL-python \
python39-mysql \
python39-mysqlclient \
python39-mysqlclient(aarch-64) \
python3dist(mysqlclient)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libmariadb.so.3()(64bit) \
libmariadb.so.3(libmysqlclient_18)(64bit) \
python(abi)"

inherit rpm
