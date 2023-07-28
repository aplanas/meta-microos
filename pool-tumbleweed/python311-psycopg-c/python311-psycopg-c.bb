SUMMARY = "PostgreSQL database adapter for Python -- C optimisation distribution"
DESCRIPTION = "PostgreSQL database adapter for Python -- C optimisation distribution"
LICENSE = "LGPL-3.0-only"

PV = "3.1.9"

RPM_NAME = "python311-psycopg-c-3.1.9-1.1.aarch64.rpm"
RPM_HASH = "df62154bdb5e5027ad045fc23cd1fb68a339bf48a6ffb0e5cf3f6ad3a4ae2e0dbb47e32ecaf888172b4252a83cc30bfb992b0dc4150371b0f3856219982389e1"

RPROVIDES:${PN} += "python3-psycopg-c \
python3.11dist-psycopg-c \
python311-psycopg-c \
python3dist-psycopg-c"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpq.so.5 \
python-abi"

inherit rpm
