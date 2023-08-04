SUMMARY = "SQLAlchemy support for Flask"
DESCRIPTION = "Adds SQLAlchemy support to your Flask application."
LICENSE = "BSD-3-Clause"

PV = "3.0.5"

RPM_NAME = "python311-Flask-SQLAlchemy-3.0.5-1.1.noarch.rpm"
RPM_HASH = "2ef81c05e70d42b1f64e22d748c87cd11c2b5fa6cf63385aa04b86857bf15a83b4346c28cf7bcba8e1a437c9f256b9537d971f93b1cf6c222a56dc923d75b569"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-SQLAlchemy \
python3.11dist-flask-sqlalchemy \
python311-Flask-SQLAlchemy \
python3dist-flask-sqlalchemy"

RDEPENDS:${PN} += "python-abi \
python311-Flask \
python311-SQLAlchemy"

inherit rpm
