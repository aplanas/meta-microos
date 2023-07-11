SUMMARY = "SQL read/write support for agate"
DESCRIPTION = "Agate-sql adds SQL read/write support to agate."
LICENSE = "MIT"

PV = "0.5.9"

RPM_NAME = "python39-agate-sql-0.5.9-2.3.noarch.rpm"
RPM_HASH = "36a47cb15ba8bbaee0bbcd424e359eb6a38138ddba26ed935d9d49c009394a1985b2e5f66cfc948b5cc8bed00572ac7a462517ee4b40897769659dfb3718331d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-agate-sql \
python39-agate-sql \
python3dist-agate-sql"

RDEPENDS:${PN} += "-python39-sqlalchemy >= 1.0.8 with python39-sqlalchemy < 2 \
python-abi \
python39-agate"

inherit rpm
