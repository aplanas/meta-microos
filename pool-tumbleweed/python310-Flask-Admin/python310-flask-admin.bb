SUMMARY = "Extensible admin interface framework for Flask"
DESCRIPTION = "Flask-Admin is a Flask extension that lets the user add admin \
interfaces to Flask applications. \
 \
It is inspired by the django-admin Python package, though the \
developer has more control over the look, feel and functionality of \
the resulting application."
LICENSE = "BSD-3-Clause"

PV = "1.6.1"

RPM_NAME = "python310-Flask-Admin-1.6.1-2.1.noarch.rpm"
RPM_HASH = "a0e515390b1699ef8c28b3f33e05c3d2ff3533fb2bae3fadc05ad985a257cec77f7ab9ff61696d539cead1e28efb4726aa2c9c43c5f2d2898401d289efb764b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flask-admin \
python310-Flask-Admin \
python3dist-flask-admin"

RDEPENDS:${PN} += "python-abi \
python310-Flask \
python310-SQLAlchemy \
python310-WTForms"

inherit rpm
