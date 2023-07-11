SUMMARY = "Implementation of the psycopg2 module using cffi"
DESCRIPTION = "This is a implementation of the psycopg2 module using cffi."
LICENSE = "LGPL-3.0-or-later"

PV = "2.9.0"

RPM_NAME = "python311-psycopg2cffi-2.9.0-3.3.aarch64.rpm"
RPM_HASH = "948405a6bcf8b0dd631ef8243decb62ec9e65ebc556084866e06451fb1a9b519a6448aeb114dd34283aded728bd59dbba65ac9618553557dd167fca0a38dfb9c"

RPROVIDES:${PN} += "python3-psycopg2cffi \
python3.11dist-psycopg2cffi \
python311-psycopg2cffi \
python3dist-psycopg2cffi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpq.so.5 \
python-abi \
python311-cffi \
python311-six"

inherit rpm
