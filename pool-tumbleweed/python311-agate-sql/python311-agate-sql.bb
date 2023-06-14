SUMMARY = "SQL read/write support for agate"
DESCRIPTION = "Agate-sql adds SQL read/write support to agate."
LICENSE = "MIT"

PV = "0.5.9"

RPM_NAME = "python311-agate-sql-0.5.9-2.1.noarch.rpm"
RPM_HASH = "a617c960a8098096aa9583ccab81724162c390d75663555ff5619f39412a1d337f1322bf34b00c1539168d13898e8a5be9403b1f65f95a08eff01670d6a14cc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-agate-sql \
python311-agate-sql \
python3dist-agate-sql"

RDEPENDS:${PN} += "-python311-sqlalchemy >= 1.0.8 with python311-sqlalchemy < 2 \
python-abi \
python311-agate"

inherit rpm
