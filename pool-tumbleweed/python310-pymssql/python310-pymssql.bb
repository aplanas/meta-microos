SUMMARY = "A simple database interface to MS-SQL for Python"
DESCRIPTION = "pymssql is the Python language extension module that provides access to \
Microsoft SQL Servers from Python scripts. It is compliant with Python \
DB-API 2.0 Specification and works on most popular operating systems."
LICENSE = "LGPL-2.1-only"

PV = "2.1.5"

RPM_NAME = "python310-pymssql-2.1.5-1.15.aarch64.rpm"
RPM_HASH = "e7804db9fcd804e707713364b8bc71d9e229a346e15c3e7ac2e9a745e7b3497ddcd43e9880d592a8ab6ae200cb313d32fec58fc73ba1aa8db27f94289b153877"

RPROVIDES:${PN} += "python3-pymssql \
python3.10dist-pymssql \
python310-pymssql \
python3dist-pymssql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsybdb.so.5 \
python-abi"

inherit rpm
