SUMMARY = "Database schema migration for SQLAlchemy"
DESCRIPTION = "Inspired by Ruby on Rails' migrations, Migrate provides a way to deal with \
database schema changes in SQLAlchemy projects. \
 \
Migrate extends SQLAlchemy to have database changeset handling. It provides a \
database change repository mechanism which can be used from the command line as \
well as from inside python code."
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "python310-sqlalchemy-migrate-0.13.0-5.4.noarch.rpm"
RPM_HASH = "3a3d9acc586f31b9a0e9871675694a48c337347cea689c28a167679f4746f07bf5a1e909b9432902960d0d47eaf4c58f6536e79e0b5183e89abaedcce58fdf60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sqlalchemy-migrate \
python3.10dist(sqlalchemy-migrate) \
python310-sqlalchemy-migrate \
python3dist(sqlalchemy-migrate)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-SQLAlchemy \
python310-Tempita \
python310-decorator \
python310-six \
python310-sqlparse \
update-alternatives"

inherit rpm
