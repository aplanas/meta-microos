SUMMARY = "Python interface to MySQL"
DESCRIPTION = "MySQLdb is an interface to the popular MySQL database server for Python. \
 \
This package adds Python 3 support and bug fixes to MySQLdb1."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.1"

RPM_NAME = "python39-mysqlclient-2.1.1-4.1.aarch64.rpm"
RPM_HASH = "5c4fa6c812167eb6bcd1719c45eb40f2fb6c17cae99384f81df866fdf6047f236149d35d986baaf651d918d64933f457ca8af72b64f86ca5793078df185547e1"

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
