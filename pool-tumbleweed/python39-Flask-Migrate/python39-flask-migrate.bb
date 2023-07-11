SUMMARY = "SQLAlchemy database migrations for Flask applications using Alembic"
DESCRIPTION = "Flask-Migrate is an extension that handles SQLAlchemy database migrations \
for Flask applications using Alembic. The database operations are provided \
as command line arguments for Flask-Script."
LICENSE = "MIT"

PV = "4.0.4"

RPM_NAME = "python39-Flask-Migrate-4.0.4-1.3.noarch.rpm"
RPM_HASH = "4be84cc16ae3f81fc47035b32644887c12fa315d9242a829cef897899b2a11f03f000cb4a7fbd0cfdd0d266ea1ccda7c5d028c009f7b07915c1da9735bfa9eb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flask-migrate \
python39-Flask-Migrate \
python3dist-flask-migrate"

RDEPENDS:${PN} += "python-abi \
python39-Flask \
python39-Flask-SQLAlchemy \
python39-alembic"

inherit rpm
