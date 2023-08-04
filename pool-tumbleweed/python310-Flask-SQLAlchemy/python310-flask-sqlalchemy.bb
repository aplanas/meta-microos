SUMMARY = "SQLAlchemy support for Flask"
DESCRIPTION = "Adds SQLAlchemy support to your Flask application."
LICENSE = "BSD-3-Clause"

PV = "3.0.5"

RPM_NAME = "python310-Flask-SQLAlchemy-3.0.5-1.1.noarch.rpm"
RPM_HASH = "65a06dcad62b715d287760f552af871d0dc31d1daa9ac28be0deee469d3bb444e6d8eac7ff7fea27708d7f02cbaef7bd6cfc80c2904185b840919fd2d7768cc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flask-sqlalchemy \
python310-Flask-SQLAlchemy \
python3dist-flask-sqlalchemy"

RDEPENDS:${PN} += "python-abi \
python310-Flask \
python310-SQLAlchemy"

inherit rpm
