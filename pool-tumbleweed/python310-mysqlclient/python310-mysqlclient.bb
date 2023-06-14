SUMMARY = "Python interface to MySQL"
DESCRIPTION = "MySQLdb is an interface to the popular MySQL database server for Python. \
 \
This package adds Python 3 support and bug fixes to MySQLdb1."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.1"

RPM_NAME = "python310-mysqlclient-2.1.1-2.1.aarch64.rpm"
RPM_HASH = "e0a8336c1150d6bdf757aad6b03ebb39ed50778c96e56221b736f1d1fe37c8c5ea9507958e80a2d1cb1d427eb8d7062ebe1c11d953cf3e777449210a7d66a538"

RPROVIDES:${PN} += "python3-MySQL-python \
python3-mysql \
python3-mysqlclient \
python3.10dist-mysqlclient \
python310-MySQL-python \
python310-mysql \
python310-mysqlclient \
python3dist-mysqlclient"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmariadb.so.3 \
python-abi"

inherit rpm
