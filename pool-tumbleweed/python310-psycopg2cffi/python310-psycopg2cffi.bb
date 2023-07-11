SUMMARY = "Implementation of the psycopg2 module using cffi"
DESCRIPTION = "This is a implementation of the psycopg2 module using cffi."
LICENSE = "LGPL-3.0-or-later"

PV = "2.9.0"

RPM_NAME = "python310-psycopg2cffi-2.9.0-3.3.aarch64.rpm"
RPM_HASH = "f2f9f4f8104a5fdd7ec64ddf73d200bf3eb5596bdc3f77f0f6debc696a4b8c79e72daa1175ec75e3fb497e7b25d0dce04af9de8f80c5c13ad7e9448b16e355c4"

RPROVIDES:${PN} += "python3.10dist-psycopg2cffi \
python310-psycopg2cffi \
python3dist-psycopg2cffi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpq.so.5 \
python-abi \
python310-cffi \
python310-six"

inherit rpm
