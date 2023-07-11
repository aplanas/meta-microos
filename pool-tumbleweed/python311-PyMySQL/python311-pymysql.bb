SUMMARY = "Pure Python MySQL Driver"
DESCRIPTION = "This package contains a pure-Python MySQL client library. Documentation on the \
MySQL client/server protocol can be found here: \
http://forge.mysql.com/wiki/MySQL_Internals_ClientServer_Protocol \
 \
The goal of pymysql is to be a drop-in replacement for MySQLdb and work on \
CPython 2.3+, Jython, IronPython, PyPy and Python 3. We test for compatibility \
by simply changing the import statements in the Django MySQL backend and running \
its unit tests as well as running it against the MySQLdb and myconnpy unit tests."
LICENSE = "MIT"

PV = "1.0.3"

RPM_NAME = "python311-PyMySQL-1.0.3-1.2.noarch.rpm"
RPM_HASH = "5aa453ba46007ae85dd5a4f569a9a48f72c7fac136646d7977c2dcd5af4080f4a7bee7cc2dd2c0ccfb90f5dc2c2ea2385f407436e7b3709b03649a8c442bf50c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyMySQL \
python3.11dist-pymysql \
python311-PyMySQL \
python3dist-pymysql"

RDEPENDS:${PN} += "python-abi \
python311-cryptography"

inherit rpm
