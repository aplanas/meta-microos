SUMMARY = "Extensible admin interface framework for Flask"
DESCRIPTION = "Flask-Admin is a Flask extension that lets the user add admin \
interfaces to Flask applications. \
 \
It is inspired by the django-admin Python package, though the \
developer has more control over the look, feel and functionality of \
the resulting application."
LICENSE = "BSD-3-Clause"

PV = "1.6.1"

RPM_NAME = "python310-Flask-Admin-1.6.1-1.1.noarch.rpm"
RPM_HASH = "2bd605467a39f29fdb6d9cf6ef089243ae3feda435a5216ad05688f68d1ef9470b9deaf73a7d6391ec5a4e838790e54f56a0a80c1778c78ab86d718a0c1c102a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flask-admin \
python310-Flask-Admin \
python3dist-flask-admin"

RDEPENDS:${PN} += "python-abi \
python310-Flask \
python310-SQLAlchemy \
python310-WTForms"

inherit rpm
