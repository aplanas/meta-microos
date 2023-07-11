SUMMARY = "Extensible admin interface framework for Flask"
DESCRIPTION = "Flask-Admin is a Flask extension that lets the user add admin \
interfaces to Flask applications. \
 \
It is inspired by the django-admin Python package, though the \
developer has more control over the look, feel and functionality of \
the resulting application."
LICENSE = "BSD-3-Clause"

PV = "1.6.1"

RPM_NAME = "python39-Flask-Admin-1.6.1-1.1.noarch.rpm"
RPM_HASH = "262baf2784c10e3d7ca92ed152d03f256e5e11454c2ee498c2fa07d7555eb0a9f58006ab213159748bf84171d74a438a9364696741844d68427aa30c2d58259a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flask-admin \
python39-Flask-Admin \
python3dist-flask-admin"

RDEPENDS:${PN} += "python-abi \
python39-Flask \
python39-SQLAlchemy \
python39-WTForms"

inherit rpm
