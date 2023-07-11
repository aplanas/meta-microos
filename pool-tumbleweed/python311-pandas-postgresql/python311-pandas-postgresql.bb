SUMMARY = "The python pandas[postgresql] extra"
DESCRIPTION = "This package provides the [postgresql] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python311-pandas-postgresql-2.0.2-4.1.noarch.rpm"
RPM_HASH = "588517d3eb68e7b308ba7e32e7ffa5f9cfb59ba7af996d95f844d32f02a4f45bd2b5dc7c0bd8dc045c17cb2f48cd036da7343dd17d18b43beec18aeeb03a8c2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-postgresql \
python311-pandas-postgresql"

RDEPENDS:${PN} += "python311-SQLAlchemy \
python311-pandas \
python311-psycopg2"

inherit rpm
