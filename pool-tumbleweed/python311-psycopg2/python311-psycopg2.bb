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

RPM_NAME = "python311-psycopg2-2.9.6-2.4.aarch64.rpm"
RPM_HASH = "53cb6d35fecec09acbf57a8636af9e9ada1888af5c6b74fdd15c1f47c4056c3bc47e567ed126094020f3b2125feae655616bcf17a328bbefb2d6aaa521c4e4ba"

RPROVIDES:${PN} += "python3-psycopg2 \
python3.11dist-psycopg2 \
python311-psycopg2 \
python3dist-psycopg2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpq.so.5 \
python-abi"

inherit rpm
