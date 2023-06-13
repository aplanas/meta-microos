SUMMARY = "Database schema migration for SQLAlchemy"
DESCRIPTION = "Inspired by Ruby on Rails' migrations, Migrate provides a way to deal with \
database schema changes in SQLAlchemy projects. \
 \
Migrate extends SQLAlchemy to have database changeset handling. It provides a \
database change repository mechanism which can be used from the command line as \
well as from inside python code."
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "python311-sqlalchemy-migrate-0.13.0-5.4.noarch.rpm"
RPM_HASH = "0c958ec792ddb5e85bd3ed0314e08aecd546fdbe05f208ad421e832f6eb09024b2950a604429f6ebeeb69bdc323a8560359fa9e8d6a6ecc5fc323a69581f9912"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sqlalchemy-migrate) \
python311-sqlalchemy-migrate \
python3dist(sqlalchemy-migrate)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-SQLAlchemy \
python311-Tempita \
python311-decorator \
python311-six \
python311-sqlparse \
update-alternatives"

inherit rpm
