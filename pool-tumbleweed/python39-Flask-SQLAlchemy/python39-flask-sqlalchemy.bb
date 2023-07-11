SUMMARY = "SQLAlchemy support for Flask"
DESCRIPTION = "Adds SQLAlchemy support to your Flask application."
LICENSE = "BSD-3-Clause"

PV = "3.0.2"

RPM_NAME = "python39-Flask-SQLAlchemy-3.0.2-2.3.noarch.rpm"
RPM_HASH = "f9f2e07ac2c8a9714e1cd881bdd03ce297ea5a1ba2b9ae3bd239dc4bab35c0cb07f1b8f697c66418edb319feb859513e95a7a27e3297e54065b1ff5af7ad9f51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flask-sqlalchemy \
python39-Flask-SQLAlchemy \
python3dist-flask-sqlalchemy"

RDEPENDS:${PN} += "python-abi \
python39-Flask \
python39-SQLAlchemy"

inherit rpm
