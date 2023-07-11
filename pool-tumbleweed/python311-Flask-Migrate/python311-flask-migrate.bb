SUMMARY = "SQLAlchemy database migrations for Flask applications using Alembic"
DESCRIPTION = "Flask-Migrate is an extension that handles SQLAlchemy database migrations \
for Flask applications using Alembic. The database operations are provided \
as command line arguments for Flask-Script."
LICENSE = "MIT"

PV = "4.0.4"

RPM_NAME = "python311-Flask-Migrate-4.0.4-1.3.noarch.rpm"
RPM_HASH = "51bc4f14d997185b50f0c9d240d5724e9cb87874a2adc85751ebb819e9624ef0f64fe8022b0a6e2eb15dcf1a1fe38faa6957d84150a39a0329edd22513c7c001"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-Migrate \
python3.11dist-flask-migrate \
python311-Flask-Migrate \
python3dist-flask-migrate"

RDEPENDS:${PN} += "python-abi \
python311-Flask \
python311-Flask-SQLAlchemy \
python311-alembic"

inherit rpm
