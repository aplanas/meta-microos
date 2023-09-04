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

RPM_NAME = "python311-PyMySQL-1.1.0-2.1.noarch.rpm"
RPM_HASH = "fba7b3ce280a031b7968750f3bf5f58b186d8f15d8f70a42160cb1502e52e2014cdd9c6d87819421b290363e74496d6b5519ad279886031df64beb95a0a58ae0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyMySQL \
python3.11dist-pymysql \
python311-PyMySQL \
python3dist-pymysql"

RDEPENDS:${PN} += "python-abi \
python311-cryptography"

inherit rpm
