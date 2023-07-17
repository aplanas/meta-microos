SUMMARY = "Extensible admin interface framework for Flask"
DESCRIPTION = "Flask-Admin is a Flask extension that lets the user add admin \
interfaces to Flask applications. \
 \
It is inspired by the django-admin Python package, though the \
developer has more control over the look, feel and functionality of \
the resulting application."
LICENSE = "BSD-3-Clause"

PV = "1.6.1"

RPM_NAME = "python39-Flask-Admin-1.6.1-2.1.noarch.rpm"
RPM_HASH = "9df3b6fe0f53a4cabd9e2d3d840e914fd91f6669ad7e40d621ad4a29f9d13fdc44bb539b106ba9f4817fea4735c0c5e75ddca6bc166ca7edca611a92add7560d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flask-admin \
python39-Flask-Admin \
python3dist-flask-admin"

RDEPENDS:${PN} += "python-abi \
python39-Flask \
python39-SQLAlchemy \
python39-WTForms"

inherit rpm
