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

RPM_NAME = "python39-psycopg2-2.9.6-2.4.aarch64.rpm"
RPM_HASH = "9c5d01c49f591dd2ac36adbd5d2ce4b22ee5b54f04f7e6ffd2037a9f02891c584a54e04640fb9296a4fd212d9a9a5e1a9cc2dd0099031eb981bf990bff323cf9"

RPROVIDES:${PN} += "python3.9dist-psycopg2 \
python39-psycopg2 \
python3dist-psycopg2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpq.so.5 \
python-abi"

inherit rpm
