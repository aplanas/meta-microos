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

RPM_NAME = "python310-psycopg2-2.9.6-2.1.aarch64.rpm"
RPM_HASH = "ecaed5ea896db482a04228d1e4fa46e9487b61836e597ed30e8c2a5141ffa4121bd60c280b266665b55a8955c04fa28b066aab9009f67d78e0b467b35a8aa69d"

RPROVIDES:${PN} += "python3-psycopg2 \
python3.10dist(psycopg2) \
python310-psycopg2 \
python310-psycopg2(aarch-64) \
python3dist(psycopg2)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libpq.so.5()(64bit) \
python(abi)"

inherit rpm
