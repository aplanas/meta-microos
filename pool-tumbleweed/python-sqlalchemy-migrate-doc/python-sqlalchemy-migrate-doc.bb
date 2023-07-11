SUMMARY = "Documentation for python-sqlalchemy-migrate"
DESCRIPTION = "Inspired by Ruby on Rails' migrations, Migrate provides a way to deal with \
database schema changes in SQLAlchemy projects. \
 \
Migrate extends SQLAlchemy to have database changeset handling. It provides a \
database change repository mechanism which can be used from the command line as \
well as from inside python code. \
 \
This package contains the documentation."
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "python-sqlalchemy-migrate-doc-0.13.0-5.5.noarch.rpm"
RPM_HASH = "3427f75e682c350727a23d1186260bb74ec5f40f9e61158702f8c0177c46f146d7e619d60604876790abd199f9c8d0ec8eeeefccc49cebd54cc45fd2815fa4ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-sqlalchemy-migrate-doc \
python310-sqlalchemy-migrate-doc \
python311-sqlalchemy-migrate-doc \
python39-sqlalchemy-migrate-doc"

RDEPENDS:${PN} += ""

inherit rpm
