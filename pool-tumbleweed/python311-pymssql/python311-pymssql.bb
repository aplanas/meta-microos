SUMMARY = "A simple database interface to MS-SQL for Python"
DESCRIPTION = "pymssql is the Python language extension module that provides access to \
Microsoft SQL Servers from Python scripts. It is compliant with Python \
DB-API 2.0 Specification and works on most popular operating systems."
LICENSE = "LGPL-2.1-only"

PV = "2.2.8"

RPM_NAME = "python311-pymssql-2.2.8-1.1.aarch64.rpm"
RPM_HASH = "a0fc40550806b394c7cf2286680e3685144a2c3549548d8ff14fab49ce13206e2dc43a80683cdb67a346adf88c88cea1352ade14c33bcee12dd3e70050b7ee43"

RPROVIDES:${PN} += "python3-pymssql \
python3.11dist-pymssql \
python311-pymssql \
python3dist-pymssql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsybdb.so.5 \
python-abi"

inherit rpm
