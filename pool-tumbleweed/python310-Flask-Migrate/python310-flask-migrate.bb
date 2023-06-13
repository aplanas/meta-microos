SUMMARY = "SQLAlchemy database migrations for Flask applications using Alembic"
DESCRIPTION = "Flask-Migrate is an extension that handles SQLAlchemy database migrations \
for Flask applications using Alembic. The database operations are provided \
as command line arguments for Flask-Script."
LICENSE = "MIT"

PV = "4.0.4"

RPM_NAME = "python310-Flask-Migrate-4.0.4-1.1.noarch.rpm"
RPM_HASH = "2e8d6d0faebef5912a4e797c895f25671fce535d67df1a90b1bee638d092cceb62d7486ceaffcfad22b684e2e4cfb0487aeea8bd2b79b90000be0d016c6b7b27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-Migrate \
python3.10dist(flask-migrate) \
python310-Flask-Migrate \
python3dist(flask-migrate)"

RDEPENDS:${PN} += "python(abi) \
python310-Flask \
python310-Flask-SQLAlchemy \
python310-alembic"

inherit rpm
