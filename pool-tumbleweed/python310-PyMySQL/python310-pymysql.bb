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

RPM_NAME = "python310-PyMySQL-1.1.0-1.1.noarch.rpm"
RPM_HASH = "4c60b50d8136c849788fe39c5f1cef43262c22857230f5df8aaa086c97c87891b8488b8164ac7fbb639748ca35e8f99d50dc49f419efc792a7e22520a1cfe408"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pymysql \
python310-PyMySQL \
python3dist-pymysql"

RDEPENDS:${PN} += "python-abi \
python310-cryptography"

inherit rpm
