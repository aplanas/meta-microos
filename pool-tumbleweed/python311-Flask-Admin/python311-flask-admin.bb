SUMMARY = "Extensible admin interface framework for Flask"
DESCRIPTION = "Flask-Admin is a Flask extension that lets the user add admin \
interfaces to Flask applications. \
 \
It is inspired by the django-admin Python package, though the \
developer has more control over the look, feel and functionality of \
the resulting application."
LICENSE = "BSD-3-Clause"

PV = "1.6.1"

RPM_NAME = "python311-Flask-Admin-1.6.1-2.1.noarch.rpm"
RPM_HASH = "62d2ac656acf460ceae003f219026287a1e6a7f11deabc52a980bb415abfc7b4fe3806b7e1f790cd67666fda5113781063f4a616114bb12feea6068254268bb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-Admin \
python3.11dist-flask-admin \
python311-Flask-Admin \
python3dist-flask-admin"

RDEPENDS:${PN} += "python-abi \
python311-Flask \
python311-SQLAlchemy \
python311-WTForms"

inherit rpm
