SUMMARY = "Implementation of the psycopg2 module using cffi"
DESCRIPTION = "This is a implementation of the psycopg2 module using cffi."
LICENSE = "LGPL-3.0-or-later"

PV = "2.9.0"

RPM_NAME = "python39-psycopg2cffi-2.9.0-3.3.aarch64.rpm"
RPM_HASH = "f93a183274c310f3c5a6575cf9ef331c70eccfc588d59ce740a1a9bd04cfde8bdfda8fb77900e17b582bb09b6bdf6742c407580c80665b0658f20e1d0504a556"

RPROVIDES:${PN} += "python3.9dist-psycopg2cffi \
python39-psycopg2cffi \
python3dist-psycopg2cffi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpq.so.5 \
python-abi \
python39-cffi \
python39-six"

inherit rpm
