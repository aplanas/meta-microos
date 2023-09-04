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

RPM_NAME = "python39-PyMySQL-1.1.0-2.1.noarch.rpm"
RPM_HASH = "0f710013ea7f4181b72863f12bbe146f1e346dacc2729ad9e20b56042443d7fe86466146225377f15ca875e88ff90ce48a61b20f44a595d9f1868d0cc8a498fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pymysql \
python39-PyMySQL \
python3dist-pymysql"

RDEPENDS:${PN} += "python-abi \
python39-cryptography"

inherit rpm
