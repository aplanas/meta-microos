SUMMARY = "Python ODBC API"
DESCRIPTION = "pyodbc is a Python 2.x and 3.x module that allows you to use ODBC \
to connect to almost any database. \
 \
It implements the Python Database API Specification v2.0, but \
additional features have been added to simplify database programming \
even more."
LICENSE = "MIT"

PV = "4.0.39"

RPM_NAME = "python311-pyodbc-4.0.39-1.3.aarch64.rpm"
RPM_HASH = "03c113aa2d9e8f45aca30259795d2849594e66f7e9a179e318af9f8a925272610f1cd591c1ceb0e97abcd3655d351e539650718bbb76eedaa82fae8241fb8649"

RPROVIDES:${PN} += "python3-pyodbc \
python3.11dist-pyodbc \
python311-pyodbc \
python3dist-pyodbc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libodbc.so.2 \
libstdc++.so.6 \
python-abi"

inherit rpm
