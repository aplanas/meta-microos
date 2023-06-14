SUMMARY = "Python-PostgreSQL Database Adapter"
DESCRIPTION = "psycopg2 is a PostgreSQL database adapter for the Python programming \
language. \
 \
psycopg2 is different from the other database adapter because it was \
designed for heavily multi-threaded applications that create and destroy \
lots of cursors and make a conspicuous number of concurrent INSERTs or \
UPDATEs. psycopg2 also provide asychronous operations and support \
for coroutine libraries."
LICENSE = "LGPL-3.0-or-later & (LGPL-3.0-or-later | ZPL-2.0) & SUSE-GPL-2.0-with-openssl-exception"

PV = "2.9.6"

RPM_NAME = "python311-psycopg2-2.9.6-2.1.aarch64.rpm"
RPM_HASH = "21356990c6a7bd31d06d24a136ecd738c38b599f796d562a490b19f4df0e587b9b1efd1810c702fca4563aa952d59a4e99c74b1d352dff6f88b5fb5719590a5b"

RPROVIDES:${PN} += "python3.11dist-psycopg2 \
python311-psycopg2 \
python3dist-psycopg2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpq.so.5 \
python-abi"

inherit rpm
