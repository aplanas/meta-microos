SUMMARY = "Implementation of the psycopg2 module using cffi"
DESCRIPTION = "This is a implementation of the psycopg2 module using cffi."
LICENSE = "LGPL-3.0-or-later"

PV = "2.9.0"

RPM_NAME = "python311-psycopg2cffi-2.9.0-2.5.aarch64.rpm"
RPM_HASH = "757fafc05b3e6a27890636e0c87f3caf08c47d23ba5bd8617b304e259bb2339daf39872aac0bcebf27cd69e071447f4dc6dc6bd3724d9262350b1b83e786599a"

RPROVIDES:${PN} += "python3.11dist(psycopg2cffi) \
python311-psycopg2cffi \
python311-psycopg2cffi(aarch-64) \
python3dist(psycopg2cffi)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libpq.so.5()(64bit) \
python(abi) \
python311-cffi \
python311-six"

inherit rpm
