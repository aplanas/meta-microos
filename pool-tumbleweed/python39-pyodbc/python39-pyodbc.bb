SUMMARY = "Python ODBC API"
DESCRIPTION = "pyodbc is a Python 2.x and 3.x module that allows you to use ODBC \
to connect to almost any database. \
 \
It implements the Python Database API Specification v2.0, but \
additional features have been added to simplify database programming \
even more."
LICENSE = "MIT"

PV = "4.0.39"

RPM_NAME = "python39-pyodbc-4.0.39-1.3.aarch64.rpm"
RPM_HASH = "e9f1c3ec660bf8b4c0ec6a996c549d4e4b2fbb4da734c8b804494785f53d1bba8473d774286291c3e9bd59ba9e2523af8b94d3bbb3b347ad86ea2145775d9728"

RPROVIDES:${PN} += "python3.9dist-pyodbc \
python39-pyodbc \
python3dist-pyodbc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libodbc.so.2 \
libstdc++.so.6 \
python-abi"

inherit rpm
