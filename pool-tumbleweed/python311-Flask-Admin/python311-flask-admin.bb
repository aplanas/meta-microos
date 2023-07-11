SUMMARY = "Extensible admin interface framework for Flask"
DESCRIPTION = "Flask-Admin is a Flask extension that lets the user add admin \
interfaces to Flask applications. \
 \
It is inspired by the django-admin Python package, though the \
developer has more control over the look, feel and functionality of \
the resulting application."
LICENSE = "BSD-3-Clause"

PV = "1.6.1"

RPM_NAME = "python311-Flask-Admin-1.6.1-1.1.noarch.rpm"
RPM_HASH = "2ba934e46abfc25663dd6c7099ab950bd002261090232e19a12d87dca410d75d5e7b5a4424bcc530e7f04f1057a95105efc7255d7bf6aba87ecc0529a5f35a27"
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
