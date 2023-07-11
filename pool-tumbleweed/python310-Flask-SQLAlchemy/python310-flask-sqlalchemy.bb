SUMMARY = "SQLAlchemy support for Flask"
DESCRIPTION = "Adds SQLAlchemy support to your Flask application."
LICENSE = "BSD-3-Clause"

PV = "3.0.2"

RPM_NAME = "python310-Flask-SQLAlchemy-3.0.2-2.3.noarch.rpm"
RPM_HASH = "ce0322099b23c0e6920ef6e48a0caf5d0a778e8c50d3be3bf446b23b5b0aaf67b443abecf928b0db3174cd3fcca1719476e287b6d305fb8aefa6c01a2ebe171d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flask-sqlalchemy \
python310-Flask-SQLAlchemy \
python3dist-flask-sqlalchemy"

RDEPENDS:${PN} += "python-abi \
python310-Flask \
python310-SQLAlchemy"

inherit rpm
