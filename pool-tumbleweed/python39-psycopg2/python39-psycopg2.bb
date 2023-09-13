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

RPM_NAME = "python39-psycopg2-2.9.7-1.1.aarch64.rpm"
RPM_HASH = "da632c395ac658f87fed4644bc380099395896ec3425ffd6f1f8bd27e09ba0781a76802cbfbecc9e5673f2bf2e4a0510c1a0fe84382aad20be3056d0fab65c3b"

RPROVIDES:${PN} += "python3.9dist-psycopg2 \
python39-psycopg2 \
python3dist-psycopg2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpq.so.5 \
python-abi"

inherit rpm
