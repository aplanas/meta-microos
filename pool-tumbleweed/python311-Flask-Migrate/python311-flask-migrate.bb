SUMMARY = "SQLAlchemy database migrations for Flask applications using Alembic"
DESCRIPTION = "Flask-Migrate is an extension that handles SQLAlchemy database migrations \
for Flask applications using Alembic. The database operations are provided \
as command line arguments for Flask-Script."
LICENSE = "MIT"

PV = "4.0.4"

RPM_NAME = "python311-Flask-Migrate-4.0.4-1.1.noarch.rpm"
RPM_HASH = "7fc9749bb6c4e652df56b93a9e3ac7b7d93431b6332c18a4487312b42b84552bb77a53d206b5ceb2b962b3fb0d61f0a11ddd86003f578bb11a718cb04885b283"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(flask-migrate) \
python311-Flask-Migrate \
python3dist(flask-migrate)"

RDEPENDS:${PN} += "python(abi) \
python311-Flask \
python311-Flask-SQLAlchemy \
python311-alembic"

inherit rpm
