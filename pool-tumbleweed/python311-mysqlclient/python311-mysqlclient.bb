SUMMARY = "Python interface to MySQL"
DESCRIPTION = "MySQLdb is an interface to the popular MySQL database server for Python. \
 \
This package adds Python 3 support and bug fixes to MySQLdb1."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.1"

RPM_NAME = "python311-mysqlclient-2.1.1-4.1.aarch64.rpm"
RPM_HASH = "41daf6b6d8c8c0d94cf5b083e23a24cf418f467b430bc0fd820b50ac328ae33d746f1106a01c28e2cd3900153842c925dbfe38fec9631d32edf77dabfa54e3d2"

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
