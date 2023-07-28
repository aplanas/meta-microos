SUMMARY = "PostgreSQL database adapter for Python"
DESCRIPTION = "PostgreSQL database adapter for Python"
LICENSE = "LGPL-3.0-only"

PV = "3.1.9"

RPM_NAME = "python310-psycopg-3.1.9-1.1.noarch.rpm"
RPM_HASH = "79fc0000b5583056c2e25e12bf60136f9fface2c6b6ede5fd6b40ec45760c3d680be3e3588707208dd37156b1911d63b74a56f65fa7008494b314daffe3ad640"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-psycopg \
python310-psycopg \
python3dist-psycopg"

RDEPENDS:${PN} += "python-abi \
python310-psycopg-c \
python310-typing-extensions"

inherit rpm
