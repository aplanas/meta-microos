SUMMARY = "Connection Pool for Psycopg"
DESCRIPTION = "Connection Pool for Psycopg"
LICENSE = "LGPL-3.0-only"

PV = "3.1.7"

RPM_NAME = "python311-psycopg-pool-3.1.7-1.1.noarch.rpm"
RPM_HASH = "57655dcf4ee41ea1cceda1f6ceeb18def3a931c3a635aa07fe6898939f210b72c2f98b28de6de3cb73867bebf78bfca969fc7b3011a1adba25eaab5f2d2fd34a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-psycopg-pool \
python3.11dist-psycopg-pool \
python311-psycopg-pool \
python3dist-psycopg-pool"

RDEPENDS:${PN} += "python-abi \
python311-typing-extensions"

inherit rpm
