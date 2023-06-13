SUMMARY = "Implementation of the psycopg2 module using cffi"
DESCRIPTION = "This is a implementation of the psycopg2 module using cffi."
LICENSE = "LGPL-3.0-or-later"

PV = "2.9.0"

RPM_NAME = "python310-psycopg2cffi-2.9.0-2.5.aarch64.rpm"
RPM_HASH = "def43b7d59fb28a1ca82b6ba5700dea6d639c95452ca7d78ce34b3da2b7bcdfd88df66b5f8b3f6a232f8b82f3292a4cd887e4edc92c68393fabe8ecf18e8bee3"

RPROVIDES:${PN} += "python3-psycopg2cffi \
python3.10dist(psycopg2cffi) \
python310-psycopg2cffi \
python310-psycopg2cffi(aarch-64) \
python3dist(psycopg2cffi)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libpq.so.5()(64bit) \
python(abi) \
python310-cffi \
python310-six"

inherit rpm
