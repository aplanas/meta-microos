SUMMARY = "SQLAlchemy support for Flask"
DESCRIPTION = "Adds SQLAlchemy support to your Flask application."
LICENSE = "BSD-3-Clause"

PV = "3.0.2"

RPM_NAME = "python311-Flask-SQLAlchemy-3.0.2-1.4.noarch.rpm"
RPM_HASH = "70f34c2aac0d151b7c43098b74889d430f311268cbe1af76ae4c2a421cfa3eb1b09fe6c131617a99ad038a84cd2256a70c6efa9748d8c8f1f03434dc79d336fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(flask-sqlalchemy) \
python311-Flask-SQLAlchemy \
python3dist(flask-sqlalchemy)"

RDEPENDS:${PN} += "python(abi) \
python311-Flask \
python311-SQLAlchemy"

inherit rpm
