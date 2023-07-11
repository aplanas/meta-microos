SUMMARY = "Python interface to MySQL"
DESCRIPTION = "MySQLdb is an interface to the popular MySQL database server for Python. \
 \
This package adds Python 3 support and bug fixes to MySQLdb1."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.1"

RPM_NAME = "python39-mysqlclient-2.1.1-3.1.aarch64.rpm"
RPM_HASH = "55287907f916716856b4915dfdd7910a62f52b64c68e74584028243389663a9f6abd287f5aaf4cb159e0a0ba126011cc3eb64ffa53146c27ac795fd82f52d423"

RPROVIDES:${PN} += "python3.9dist-mysqlclient \
python39-MySQL-python \
python39-mysql \
python39-mysqlclient \
python3dist-mysqlclient"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmariadb.so.3 \
python-abi"

inherit rpm
