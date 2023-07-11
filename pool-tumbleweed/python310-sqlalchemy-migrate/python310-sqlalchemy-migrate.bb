SUMMARY = "Database schema migration for SQLAlchemy"
DESCRIPTION = "Inspired by Ruby on Rails' migrations, Migrate provides a way to deal with \
database schema changes in SQLAlchemy projects. \
 \
Migrate extends SQLAlchemy to have database changeset handling. It provides a \
database change repository mechanism which can be used from the command line as \
well as from inside python code."
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "python310-sqlalchemy-migrate-0.13.0-5.5.noarch.rpm"
RPM_HASH = "548ee646303e64fc24b2ad2085565a37c35109385ca4189897b37cacd220663347fadc9aa7c269c27b2e7b7f6fe69cc68f0fecc0fdf9fc3b6a73fb0ab38ed061"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sqlalchemy-migrate \
python310-sqlalchemy-migrate \
python3dist-sqlalchemy-migrate"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-SQLAlchemy \
python310-Tempita \
python310-decorator \
python310-six \
python310-sqlparse \
update-alternatives"

inherit rpm
