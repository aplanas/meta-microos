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

RPM_NAME = "python39-PyMySQL-1.0.3-1.2.noarch.rpm"
RPM_HASH = "fb51976f27ada167be5389cbdd2de90a78a4e9e818f2bd18b6fcbbfc5897a57c6766c257660944b6c85d5483bfd34d6a2356b24ad77df182be4dcc7b5442b8c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pymysql \
python39-PyMySQL \
python3dist-pymysql"

RDEPENDS:${PN} += "python-abi \
python39-cryptography"

inherit rpm
