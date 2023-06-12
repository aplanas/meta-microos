SUMMARY = "SQLAlchemy support for Flask"
DESCRIPTION = "Adds SQLAlchemy support to your Flask application."
LICENSE = "BSD-3-Clause"

PV = "3.0.2"

RPM_NAME = "python39-Flask-SQLAlchemy-3.0.2-1.4.noarch.rpm"
RPM_HASH = "8bacc32bafcf49abfc962b4319f461b0390a5cee6760e33363a953eb0d1bbfc972335c0c1e402ec88003a5e224f1ccf6140594e652ee93798c01bef021b8eb49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(flask-sqlalchemy) \
python39-Flask-SQLAlchemy \
python3dist(flask-sqlalchemy)"
RDEPENDS:${PN} += "python(abi) \
python39-Flask \
python39-SQLAlchemy"

inherit rpm
