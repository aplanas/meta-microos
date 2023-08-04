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

PV = "1.1.0"

RPM_NAME = "python311-PyMySQL-1.1.0-1.1.noarch.rpm"
RPM_HASH = "c83460ace29e7bea62bf6680900bd4bcf56895459e586e0d0b7089ccf7e0fe16af67fc91042779b2fb3a933a77802f02a17b06f590b955b2803eecefe7153f06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyMySQL \
python3.11dist-pymysql \
python311-PyMySQL \
python3dist-pymysql"

RDEPENDS:${PN} += "python-abi \
python311-cryptography"

inherit rpm
