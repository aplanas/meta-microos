SUMMARY = "PostgreSQL database adapter for Python -- C optimisation distribution"
DESCRIPTION = "PostgreSQL database adapter for Python -- C optimisation distribution"
LICENSE = "LGPL-3.0-only"

PV = "3.1.9"

RPM_NAME = "python310-psycopg-c-3.1.9-1.1.aarch64.rpm"
RPM_HASH = "97e2a1c86336f1e9ca266616b1cb4aac7ea228f5935eeca294512299b01697d5728e8c4762cd370df5fd74581db6243884f661760d353715ef009539b94fea24"

RPROVIDES:${PN} += "python3.10dist-psycopg-c \
python310-psycopg-c \
python3dist-psycopg-c"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpq.so.5 \
python-abi"

inherit rpm
