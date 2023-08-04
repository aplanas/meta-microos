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

RPM_NAME = "python39-PyMySQL-1.1.0-1.1.noarch.rpm"
RPM_HASH = "162a98ffd74dc5e19e36f8138475f813cf26a1c11d8a617911b5eec6d0d11bb7f366bf0e5b27f31edef400430fc608fc03075053ddadd65ee1d3e4e6f9f521f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pymysql \
python39-PyMySQL \
python3dist-pymysql"

RDEPENDS:${PN} += "python-abi \
python39-cryptography"

inherit rpm
