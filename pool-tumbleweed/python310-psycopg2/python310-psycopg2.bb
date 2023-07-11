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

RPM_NAME = "python310-psycopg2-2.9.6-2.4.aarch64.rpm"
RPM_HASH = "d15c5c3ff253a1f38d2c3c0c93ba9a05e601b27f2fd604aef5a4e1486a08f570985d6d4e6ef5d73a388ef2c9416a7dbfb0d81fa047f7f1dcf5e31b4d2af58577"

RPROVIDES:${PN} += "python3.10dist-psycopg2 \
python310-psycopg2 \
python3dist-psycopg2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpq.so.5 \
python-abi"

inherit rpm
