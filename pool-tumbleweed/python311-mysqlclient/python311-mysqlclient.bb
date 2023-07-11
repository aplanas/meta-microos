SUMMARY = "Python interface to MySQL"
DESCRIPTION = "MySQLdb is an interface to the popular MySQL database server for Python. \
 \
This package adds Python 3 support and bug fixes to MySQLdb1."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.1"

RPM_NAME = "python311-mysqlclient-2.1.1-3.1.aarch64.rpm"
RPM_HASH = "b032e9acb55e32d9510d9809f7e94996e33feeab08a68f6b43baff943a1029b81dfc80f9d4daa822f829b89b4346cbcb44e8259759f2456df8a8130bfdfd75cb"

RPROVIDES:${PN} += "python3-MySQL-python \
python3-mysql \
python3-mysqlclient \
python3.11dist-mysqlclient \
python311-MySQL-python \
python311-mysql \
python311-mysqlclient \
python3dist-mysqlclient"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmariadb.so.3 \
python-abi"

inherit rpm
