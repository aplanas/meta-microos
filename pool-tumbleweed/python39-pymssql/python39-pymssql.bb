SUMMARY = "A simple database interface to MS-SQL for Python"
DESCRIPTION = "pymssql is the Python language extension module that provides access to \
Microsoft SQL Servers from Python scripts. It is compliant with Python \
DB-API 2.0 Specification and works on most popular operating systems."
LICENSE = "LGPL-2.1-only"

PV = "2.1.5"

RPM_NAME = "python39-pymssql-2.1.5-1.17.aarch64.rpm"
RPM_HASH = "39df4681edd5e6f13921b86088d30ded6bc05a84ecf1db328d8b99d3c408cdcd17d60a6dd67742988e4600761662675810146c6df4798db20eff1eeaa9c7307d"

RPROVIDES:${PN} += "python3.9dist-pymssql \
python39-pymssql \
python3dist-pymssql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsybdb.so.5 \
python-abi"

inherit rpm
