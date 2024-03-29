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

RPM_NAME = "python310-PyMySQL-1.1.0-2.1.noarch.rpm"
RPM_HASH = "d7b84a26a630969a68e24dda8154df476f1dd2eeaab20225128c177113d5f802ee67996406ab118a0fc6b07fa8e7d08cf85e25c85139f171ec81d9c3ce55a6f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pymysql \
python310-PyMySQL \
python3dist-pymysql"

RDEPENDS:${PN} += "python-abi \
python310-cryptography"

inherit rpm
