SUMMARY = "The python pandas[postgresql] extra"
DESCRIPTION = "This package provides the [postgresql] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python39-pandas-postgresql-2.0.3-1.3.noarch.rpm"
RPM_HASH = "236039bb2089c4a68e067b7df28ba689d33a575154a1a935c48ef4487dd322891948f36ad56df5a8fa8db685d7891521a62913c846d90eda8982c75bfa082de6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-postgresql"

RDEPENDS:${PN} += "python39-SQLAlchemy \
python39-pandas \
python39-psycopg2"

inherit rpm
