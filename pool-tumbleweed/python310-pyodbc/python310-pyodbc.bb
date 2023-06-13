SUMMARY = "Python ODBC API"
DESCRIPTION = "pyodbc is a Python 2.x and 3.x module that allows you to use ODBC \
to connect to almost any database. \
 \
It implements the Python Database API Specification v2.0, but \
additional features have been added to simplify database programming \
even more."
LICENSE = "MIT"

PV = "4.0.39"

RPM_NAME = "python310-pyodbc-4.0.39-1.1.aarch64.rpm"
RPM_HASH = "66bfd082aea6ec92c1fd0ecb30f2eb0ec349f8cc1546f42a32cb78ea74476e3b47b5457fb88ec7f5930dbe6a76f230449d93be42b7ac735dbe02fe5644c76387"

RPROVIDES:${PN} += "python3-pyodbc \
python3.10dist(pyodbc) \
python310-pyodbc \
python310-pyodbc(aarch-64) \
python3dist(pyodbc)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libodbc.so.2()(64bit) \
libstdc++.so.6()(64bit) \
python(abi)"

inherit rpm
