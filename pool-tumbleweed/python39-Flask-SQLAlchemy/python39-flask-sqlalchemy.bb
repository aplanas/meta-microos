SUMMARY = "SQLAlchemy support for Flask"
DESCRIPTION = "Adds SQLAlchemy support to your Flask application."
LICENSE = "BSD-3-Clause"

PV = "3.0.5"

RPM_NAME = "python39-Flask-SQLAlchemy-3.0.5-1.1.noarch.rpm"
RPM_HASH = "43284eb47b8599452bc2dc5354b7eb3329043d09271e030c89b31a972cbb042cd081f89fac77516a5bad071cfe8e08817ffee95be282052aa1e7064057ca8723"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flask-sqlalchemy \
python39-Flask-SQLAlchemy \
python3dist-flask-sqlalchemy"

RDEPENDS:${PN} += "python-abi \
python39-Flask \
python39-SQLAlchemy"

inherit rpm
