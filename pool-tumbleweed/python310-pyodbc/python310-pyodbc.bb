SUMMARY = "Python ODBC API"
DESCRIPTION = "pyodbc is a Python 2.x and 3.x module that allows you to use ODBC \
to connect to almost any database. \
 \
It implements the Python Database API Specification v2.0, but \
additional features have been added to simplify database programming \
even more."
LICENSE = "MIT"

PV = "4.0.39"

RPM_NAME = "python310-pyodbc-4.0.39-1.3.aarch64.rpm"
RPM_HASH = "31abff2e6ae1315de69e31cd09676b347a505f2a5fdbc2a2f4316b992d774c4598ea2899c0ea631888a5c07c27da42a564759afc38df417a20a966544f2dc091"

RPROVIDES:${PN} += "python3.10dist-pyodbc \
python310-pyodbc \
python3dist-pyodbc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libodbc.so.2 \
libstdc++.so.6 \
python-abi"

inherit rpm
