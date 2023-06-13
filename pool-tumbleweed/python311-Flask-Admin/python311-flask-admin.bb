SUMMARY = "Extensible admin interface framework for Flask"
DESCRIPTION = "Flask-Admin is a Flask extension that lets the user add admin \
interfaces to Flask applications. \
 \
It is inspired by the django-admin Python package, though the \
developer has more control over the look, feel and functionality of \
the resulting application."
LICENSE = "BSD-3-Clause"

PV = "1.6.0"

RPM_NAME = "python311-Flask-Admin-1.6.0-3.4.noarch.rpm"
RPM_HASH = "0d717a01daf0a98fac8738f56a01987891b422aaeb995900be89559b6c32cf0259f9b671e54c1fe4d2406c7f715af2b0fae84832db57f3da95b2e5d9be60c972"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(flask-admin) \
python311-Flask-Admin \
python3dist(flask-admin)"

RDEPENDS:${PN} += "python(abi) \
python311-Flask \
python311-WTForms"

inherit rpm
