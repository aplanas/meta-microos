SUMMARY = "Python interface to MySQL"
DESCRIPTION = "MySQLdb is an interface to the popular MySQL database server for Python. \
 \
This package adds Python 3 support and bug fixes to MySQLdb1."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.1"

RPM_NAME = "python310-mysqlclient-2.1.1-3.1.aarch64.rpm"
RPM_HASH = "fea4c401bbf5dd3b06c592fddbc76c429ccf5a4aa47bce9e601d51752e064351b200925cbba5f959005a67c6a35f286230c9bce127de15ba46a1d399fa8d708f"

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
