SUMMARY = "Database schema migration for SQLAlchemy"
DESCRIPTION = "Inspired by Ruby on Rails' migrations, Migrate provides a way to deal with \
database schema changes in SQLAlchemy projects. \
 \
Migrate extends SQLAlchemy to have database changeset handling. It provides a \
database change repository mechanism which can be used from the command line as \
well as from inside python code."
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "python39-sqlalchemy-migrate-0.13.0-5.4.noarch.rpm"
RPM_HASH = "aec4ac5b6d1a9a086364587688b826c52a58261f4842e5dc9e01db0d95bb924dd005640309e597ae3fb4c8be4289080a87aecc62e7f30e8c4ada9b5660593170"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sqlalchemy-migrate) \
python39-sqlalchemy-migrate \
python3dist(sqlalchemy-migrate)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-SQLAlchemy \
python39-Tempita \
python39-decorator \
python39-six \
python39-sqlparse \
update-alternatives"

inherit rpm
