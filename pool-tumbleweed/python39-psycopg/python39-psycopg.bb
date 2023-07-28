SUMMARY = "PostgreSQL database adapter for Python"
DESCRIPTION = "PostgreSQL database adapter for Python"
LICENSE = "LGPL-3.0-only"

PV = "3.1.9"

RPM_NAME = "python39-psycopg-3.1.9-1.1.noarch.rpm"
RPM_HASH = "d88647f16b84e718748f9ff14e868d75fbc6a03eda99ed97a26e102b21b88261b735e21e5d0f11c0671209897794387a9afe95dc24c7b301567c2477fdecd374"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-psycopg \
python39-psycopg \
python3dist-psycopg"

RDEPENDS:${PN} += "python-abi \
python39-psycopg-c \
python39-typing-extensions"

inherit rpm
