SUMMARY = "PostgreSQL database adapter for Python -- C optimisation distribution"
DESCRIPTION = "PostgreSQL database adapter for Python -- C optimisation distribution"
LICENSE = "LGPL-3.0-only"

PV = "3.1.9"

RPM_NAME = "python39-psycopg-c-3.1.9-1.1.aarch64.rpm"
RPM_HASH = "92793c1b503be4a7b13c1ea72882c483715d4792461753d42d08c713afbdd19c9ffbc3b5aeb5aa4aec8d9e4a4ae8f90e869d4a0f24291037dd34364682749f00"

RPROVIDES:${PN} += "python3.9dist-psycopg-c \
python39-psycopg-c \
python3dist-psycopg-c"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpq.so.5 \
python-abi"

inherit rpm
