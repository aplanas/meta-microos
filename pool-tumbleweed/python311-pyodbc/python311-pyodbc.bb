SUMMARY = "Python ODBC API"
DESCRIPTION = "pyodbc is a Python 2.x and 3.x module that allows you to use ODBC \
to connect to almost any database. \
 \
It implements the Python Database API Specification v2.0, but \
additional features have been added to simplify database programming \
even more."
LICENSE = "MIT"

PV = "4.0.39"

RPM_NAME = "python311-pyodbc-4.0.39-1.1.aarch64.rpm"
RPM_HASH = "43073e63bcf433984f2da255e2df78b938c7520d44ec5fb2270376d090b8b2ebac9a2c8164d5d9f25e9cc95ea55a667af79e1301757b7c47afaaee39e44d171c"

RPROVIDES:${PN} += "python3.11dist(pyodbc) \
python311-pyodbc \
python311-pyodbc(aarch-64) \
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
