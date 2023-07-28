SUMMARY = "Connection Pool for Psycopg"
DESCRIPTION = "Connection Pool for Psycopg"
LICENSE = "LGPL-3.0-only"

PV = "3.1.7"

RPM_NAME = "python310-psycopg-pool-3.1.7-1.1.noarch.rpm"
RPM_HASH = "3e74635bf27924851dd0f53f7fb6096f1fcf6268aedb8c6aaa1be6c120c5da96a30238bcc7fa09ef9b4e07b0db9386d8e4611efeda91b2aded94231857e1d1c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-psycopg-pool \
python310-psycopg-pool \
python3dist-psycopg-pool"

RDEPENDS:${PN} += "python-abi \
python310-typing-extensions"

inherit rpm
