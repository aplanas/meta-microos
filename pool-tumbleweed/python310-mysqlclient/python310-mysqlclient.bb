SUMMARY = "Python interface to MySQL"
DESCRIPTION = "MySQLdb is an interface to the popular MySQL database server for Python. \
 \
This package adds Python 3 support and bug fixes to MySQLdb1."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.1"

RPM_NAME = "python310-mysqlclient-2.1.1-4.1.aarch64.rpm"
RPM_HASH = "a2e5e4a08a4491a1dea66ebb2bd975181ecf9d28d2943e178b5758ebbdc1dc34c6234faf9b199416911226baed075b8452bbf7bb9f3a4272b90051050eab82c8"

RPROVIDES:${PN} += "python3.10dist-mysqlclient \
python310-MySQL-python \
python310-mysql \
python310-mysqlclient \
python3dist-mysqlclient"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmariadb.so.3 \
python-abi"

inherit rpm
