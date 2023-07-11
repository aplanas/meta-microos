SUMMARY = "SQLAlchemy support for Flask"
DESCRIPTION = "Adds SQLAlchemy support to your Flask application."
LICENSE = "BSD-3-Clause"

PV = "3.0.2"

RPM_NAME = "python311-Flask-SQLAlchemy-3.0.2-2.3.noarch.rpm"
RPM_HASH = "b139690517496413cd80c0e0c37aaa93dc0eec95b362233b07d461c4eca106a03fd1d03c15eccc6587362c450fe8723ae5eb6940b86a745520cb80b2c13a8ec2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-SQLAlchemy \
python3.11dist-flask-sqlalchemy \
python311-Flask-SQLAlchemy \
python3dist-flask-sqlalchemy"

RDEPENDS:${PN} += "python-abi \
python311-Flask \
python311-SQLAlchemy"

inherit rpm
