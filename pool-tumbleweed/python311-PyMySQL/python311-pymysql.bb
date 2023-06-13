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

RPM_NAME = "python311-PyMySQL-1.0.3-1.1.noarch.rpm"
RPM_HASH = "6ebe5f9f2bdf5418c5fcf353640e23a4216f2689973324e1eb5d573a944af918385d179443eedec19e5ad177250015d1ed885fa6b34de1e9b2e457d9b73653a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pymysql) \
python311-PyMySQL \
python3dist(pymysql)"

RDEPENDS:${PN} += "python(abi) \
python311-cryptography"

inherit rpm
