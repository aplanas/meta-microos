SUMMARY = "SQLAlchemy support for Flask"
DESCRIPTION = "Adds SQLAlchemy support to your Flask application."
LICENSE = "BSD-3-Clause"

PV = "3.0.2"

RPM_NAME = "python310-Flask-SQLAlchemy-3.0.2-1.4.noarch.rpm"
RPM_HASH = "9f2530c980b8d77d723e44b69630927c41b8421d295bc752d7bc8480f3a2b99cec34508913dfd5eb42c9792d5c12779eb5e66eaedfc9a178af19f632db74db7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-SQLAlchemy \
python3.10dist-flask-sqlalchemy \
python310-Flask-SQLAlchemy \
python3dist-flask-sqlalchemy"

RDEPENDS:${PN} += "python-abi \
python310-Flask \
python310-SQLAlchemy"

inherit rpm
