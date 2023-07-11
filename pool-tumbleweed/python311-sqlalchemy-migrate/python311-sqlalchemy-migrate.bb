SUMMARY = "Database schema migration for SQLAlchemy"
DESCRIPTION = "Inspired by Ruby on Rails' migrations, Migrate provides a way to deal with \
database schema changes in SQLAlchemy projects. \
 \
Migrate extends SQLAlchemy to have database changeset handling. It provides a \
database change repository mechanism which can be used from the command line as \
well as from inside python code."
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "python311-sqlalchemy-migrate-0.13.0-5.5.noarch.rpm"
RPM_HASH = "2270a55fc570c39daafce3ceea2deb40bb72303e64471998cd5036d8e57ea0d36b54422ca5ab9ab081f3f946bf37fcdd9efd8b260817653bb2bbd748481718ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sqlalchemy-migrate \
python3.11dist-sqlalchemy-migrate \
python311-sqlalchemy-migrate \
python3dist-sqlalchemy-migrate"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-SQLAlchemy \
python311-Tempita \
python311-decorator \
python311-six \
python311-sqlparse \
update-alternatives"

inherit rpm
