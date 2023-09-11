SUMMARY = "The python pandas[postgresql] extra"
DESCRIPTION = "This package provides the [postgresql] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python311-pandas-postgresql-2.0.3-1.3.noarch.rpm"
RPM_HASH = "ac66019efcd130efddb7c01227ece3fdacc14bf71c893d6d2bd8472dcec077b868a8ccea7bc2ed5bbf874e94b8d5a679ce221ae5603e2d0a71d4a7e7c4f432ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-postgresql \
python311-pandas-postgresql"

RDEPENDS:${PN} += "python311-SQLAlchemy \
python311-pandas \
python311-psycopg2"

inherit rpm
