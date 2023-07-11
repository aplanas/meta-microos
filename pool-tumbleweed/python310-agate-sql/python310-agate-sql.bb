SUMMARY = "SQL read/write support for agate"
DESCRIPTION = "Agate-sql adds SQL read/write support to agate."
LICENSE = "MIT"

PV = "0.5.9"

RPM_NAME = "python310-agate-sql-0.5.9-2.3.noarch.rpm"
RPM_HASH = "d62da006e4b117222c994584161f50403791ec8739d588663028e4d355950479ef24a614e8f3ac072c994a541b2cdbf265e8840553cbc913979a4e4f04abae0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-agate-sql \
python310-agate-sql \
python3dist-agate-sql"

RDEPENDS:${PN} += "-python310-sqlalchemy >= 1.0.8 with python310-sqlalchemy < 2 \
python-abi \
python310-agate"

inherit rpm
