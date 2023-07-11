SUMMARY = "SQLAlchemy database migrations for Flask applications using Alembic"
DESCRIPTION = "Flask-Migrate is an extension that handles SQLAlchemy database migrations \
for Flask applications using Alembic. The database operations are provided \
as command line arguments for Flask-Script."
LICENSE = "MIT"

PV = "4.0.4"

RPM_NAME = "python310-Flask-Migrate-4.0.4-1.3.noarch.rpm"
RPM_HASH = "4da9988a57f8a11b56de153609fa67025899af442604324a6f63f3b2f38c84bacb34eabd57730ee0e0279fd99672cf5a7b07e97b4cab656bd0c14afdd99cbd87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flask-migrate \
python310-Flask-Migrate \
python3dist-flask-migrate"

RDEPENDS:${PN} += "python-abi \
python310-Flask \
python310-Flask-SQLAlchemy \
python310-alembic"

inherit rpm
