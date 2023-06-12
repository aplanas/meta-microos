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

RPM_NAME = "python-sqlalchemy-migrate-doc-0.13.0-5.4.noarch.rpm"
RPM_HASH = "52fecb6d80b6b057fe744f8c06750a23d3bca3a36c260f5c56c2001c7c657e63721918a78cca2d4d1d5b71436a79a39742f8a573e77f02b8abc42949f87e2421"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-sqlalchemy-migrate-doc \
python310-sqlalchemy-migrate-doc \
python311-sqlalchemy-migrate-doc \
python39-sqlalchemy-migrate-doc"
RDEPENDS:${PN} += ""

inherit rpm
