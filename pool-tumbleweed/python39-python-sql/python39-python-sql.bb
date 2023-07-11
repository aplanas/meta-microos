SUMMARY = "Library to write SQL queries"
DESCRIPTION = "python-sql is a library to write SQL queries in a pythonic way."
LICENSE = "BSD-3-Clause"

PV = "1.4.0"

RPM_NAME = "python39-python-sql-1.4.0-1.6.noarch.rpm"
RPM_HASH = "118ff47073ca49a9d36a0c30fb9e8d7d469b64b2c9f48514c1e2d3f01019945f5cdfee778b137756c76d5f5a9b40d7aa730ae4e211f4a55e07b3b471e63aed1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-sql \
python39-python-sql \
python3dist-python-sql"

RDEPENDS:${PN} += "python-abi"

inherit rpm
