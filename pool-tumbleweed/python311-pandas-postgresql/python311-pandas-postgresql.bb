SUMMARY = "The python pandas[postgresql] extra"
DESCRIPTION = "This package provides the [postgresql] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python311-pandas-postgresql-2.1.0-1.2.noarch.rpm"
RPM_HASH = "7e5089490d04b930f3b37677d4893e223cedbf23df5656a7b3514328e44b47b44c1b7efca6a08a2cbc5440102aa7d680da881dd428b2a410a49d53d599c7dc63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-postgresql \
python311-pandas-postgresql"

RDEPENDS:${PN} += "python311-SQLAlchemy \
python311-pandas \
python311-psycopg2"

inherit rpm
