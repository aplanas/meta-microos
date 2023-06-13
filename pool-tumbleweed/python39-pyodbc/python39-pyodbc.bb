SUMMARY = "Python ODBC API"
DESCRIPTION = "pyodbc is a Python 2.x and 3.x module that allows you to use ODBC \
to connect to almost any database. \
 \
It implements the Python Database API Specification v2.0, but \
additional features have been added to simplify database programming \
even more."
LICENSE = "MIT"

PV = "4.0.39"

RPM_NAME = "python39-pyodbc-4.0.39-1.1.aarch64.rpm"
RPM_HASH = "3e37022000bb64bd158d888a9bdfeb70a62be089810c66a49ada97c1f489dd28b79918384bf1aae39bf2ddf1ed002fa0504558f5eea246414ba932f6740ee502"

RPROVIDES:${PN} += "python3.9dist(pyodbc) \
python39-pyodbc \
python39-pyodbc(aarch-64) \
python3dist(pyodbc)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libodbc.so.2()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
python(abi)"

inherit rpm
