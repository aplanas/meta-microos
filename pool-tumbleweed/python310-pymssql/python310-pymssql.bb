SUMMARY = "A simple database interface to MS-SQL for Python"
DESCRIPTION = "pymssql is the Python language extension module that provides access to \
Microsoft SQL Servers from Python scripts. It is compliant with Python \
DB-API 2.0 Specification and works on most popular operating systems."
LICENSE = "LGPL-2.1-only"

PV = "2.1.5"

RPM_NAME = "python310-pymssql-2.1.5-1.17.aarch64.rpm"
RPM_HASH = "766ea4c6eaeeb2820c70e3920ba17c53f6d7f1d036129c034ff6f05cecc77683f69ddcf7c1445112839ff1d79a712ab6045220aa4bfd9bf71694139f76e0092d"

RPROVIDES:${PN} += "python3.10dist-pymssql \
python310-pymssql \
python3dist-pymssql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsybdb.so.5 \
python-abi"

inherit rpm
