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

RPM_NAME = "python311-psycopg2-2.9.7-1.1.aarch64.rpm"
RPM_HASH = "13b22379180eff1c9e973670372cb9cf6c1595d279f256cc73cff25c3fe2af34d07880814637157b87e78d14e0ffb1345cf99806c4fb8acaf986bac5cc36999a"

RPROVIDES:${PN} += "python3-psycopg2 \
python3.11dist-psycopg2 \
python311-psycopg2 \
python3dist-psycopg2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpq.so.5 \
python-abi"

inherit rpm
