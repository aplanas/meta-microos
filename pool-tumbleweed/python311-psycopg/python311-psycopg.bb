SUMMARY = "PostgreSQL database adapter for Python"
DESCRIPTION = "PostgreSQL database adapter for Python"
LICENSE = "LGPL-3.0-only"

PV = "3.1.9"

RPM_NAME = "python311-psycopg-3.1.9-1.1.noarch.rpm"
RPM_HASH = "9ee5cd98cc52e81e96beeb0fdcd9debc2cf1b4e0e6911ff47da3b088566fb357244106515b76671104b7e3f065e62010635ab082b66c793bc1714ef2ed43281e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-psycopg \
python3.11dist-psycopg \
python311-psycopg \
python3dist-psycopg"

RDEPENDS:${PN} += "python-abi \
python311-psycopg-c \
python311-typing-extensions"

inherit rpm
