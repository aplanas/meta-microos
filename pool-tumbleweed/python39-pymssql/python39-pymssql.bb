SUMMARY = "A simple database interface to MS-SQL for Python"
DESCRIPTION = "pymssql is the Python language extension module that provides access to \
Microsoft SQL Servers from Python scripts. It is compliant with Python \
DB-API 2.0 Specification and works on most popular operating systems."
LICENSE = "LGPL-2.1-only"

PV = "2.2.8"

RPM_NAME = "python39-pymssql-2.2.8-1.1.aarch64.rpm"
RPM_HASH = "03ae3834351db86a7aa4604c770cc7fd71e8b8f4c8707277a55bde926f16b406c997ad5bc669ba1d22ef5d64c8addd2320bdff08ebdb75d52eae816e7166eb17"

RPROVIDES:${PN} += "python3.9dist-pymssql \
python39-pymssql \
python3dist-pymssql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsybdb.so.5 \
python-abi"

inherit rpm
