SUMMARY = "Connection Pool for Psycopg"
DESCRIPTION = "Connection Pool for Psycopg"
LICENSE = "LGPL-3.0-only"

PV = "3.1.7"

RPM_NAME = "python39-psycopg-pool-3.1.7-1.1.noarch.rpm"
RPM_HASH = "41981afcf6317620b7878510ad0dbe7e6880d82a0a740bd16f3046d53ac9f0a1b1c91541b88eefb42269e54deb7627a6864bfab46db23cd4f93d439f6b75bcb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-psycopg-pool \
python39-psycopg-pool \
python3dist-psycopg-pool"

RDEPENDS:${PN} += "python-abi \
python39-typing-extensions"

inherit rpm
