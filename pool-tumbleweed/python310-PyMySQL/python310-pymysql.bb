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

RPM_NAME = "python310-PyMySQL-1.0.3-1.2.noarch.rpm"
RPM_HASH = "d3fd10ac67ce927f8a975ac49dbed44847a40017a8022163a1053a03d9ed2c1994090aa4aee8493875032e649b02a68b644da6d076277dd6be110c0f483b86f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pymysql \
python310-PyMySQL \
python3dist-pymysql"

RDEPENDS:${PN} += "python-abi \
python310-cryptography"

inherit rpm
