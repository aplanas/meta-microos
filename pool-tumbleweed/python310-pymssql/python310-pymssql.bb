SUMMARY = "A simple database interface to MS-SQL for Python"
DESCRIPTION = "pymssql is the Python language extension module that provides access to \
Microsoft SQL Servers from Python scripts. It is compliant with Python \
DB-API 2.0 Specification and works on most popular operating systems."
LICENSE = "LGPL-2.1-only"

PV = "2.2.8"

RPM_NAME = "python310-pymssql-2.2.8-1.1.aarch64.rpm"
RPM_HASH = "96f607a78a05cb03c176a855d0649ba2b22f7de2308c3fac7227bd0233503adb16ed2cbca2aa4b1b6a4c24f14e48d52a9571e53dfdd2dc6c17c6b6c78232f953"

RPROVIDES:${PN} += "python3.10dist-pymssql \
python310-pymssql \
python3dist-pymssql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsybdb.so.5 \
python-abi"

inherit rpm
