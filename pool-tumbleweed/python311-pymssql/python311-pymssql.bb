SUMMARY = "A simple database interface to MS-SQL for Python"
DESCRIPTION = "pymssql is the Python language extension module that provides access to \
Microsoft SQL Servers from Python scripts. It is compliant with Python \
DB-API 2.0 Specification and works on most popular operating systems."
LICENSE = "LGPL-2.1-only"

PV = "2.1.5"

RPM_NAME = "python311-pymssql-2.1.5-1.17.aarch64.rpm"
RPM_HASH = "e51d0336d5c42c0c2857a8a40ae6ac3a2b6ba97c5aa48ac725e564cd72e7cd3e1b54d3617eec2eb30c4cd6acad596914a57f92defb70ea36a95132a782e5794b"

RPROVIDES:${PN} += "python3-pymssql \
python3.11dist-pymssql \
python311-pymssql \
python3dist-pymssql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsybdb.so.5 \
python-abi"

inherit rpm
