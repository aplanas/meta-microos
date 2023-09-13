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

PV = "2.9.7"

RPM_NAME = "python310-psycopg2-2.9.7-1.1.aarch64.rpm"
RPM_HASH = "73048522201e7f9f6f66eb0c2f2f8c68835c126dc581dfc2fb6c5dda0117d65395f0d3278eb1af9718f9363382983736ae1c22cdc46e737a4410ede9e7d381f6"

RPROVIDES:${PN} += "python3.10dist-psycopg2 \
python310-psycopg2 \
python3dist-psycopg2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpq.so.5 \
python-abi"

inherit rpm
