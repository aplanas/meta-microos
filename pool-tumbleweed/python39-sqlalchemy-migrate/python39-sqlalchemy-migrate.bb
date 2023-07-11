SUMMARY = "Database schema migration for SQLAlchemy"
DESCRIPTION = "Inspired by Ruby on Rails' migrations, Migrate provides a way to deal with \
database schema changes in SQLAlchemy projects. \
 \
Migrate extends SQLAlchemy to have database changeset handling. It provides a \
database change repository mechanism which can be used from the command line as \
well as from inside python code."
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "python39-sqlalchemy-migrate-0.13.0-5.5.noarch.rpm"
RPM_HASH = "a04ff3a8d14f4ca16352cf2fcbacf2b70514ab1d6c4e198b71446860f612fb49dbcc9e2a0c6488e092f6c999d3d31f965b626235843a387afcb9d75291b1eb88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sqlalchemy-migrate \
python39-sqlalchemy-migrate \
python3dist-sqlalchemy-migrate"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-SQLAlchemy \
python39-Tempita \
python39-decorator \
python39-six \
python39-sqlparse \
update-alternatives"

inherit rpm
