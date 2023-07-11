SUMMARY = "Flask extension providing simple email sending capabilities"
DESCRIPTION = "Flask-Mailman is a Flask extension providing simple email sending capabilities. \
 \
It was meant to replace unmaintained Flask-Mail with a better warranty and \
more features."
LICENSE = "BSD-3-Clause"

PV = "0.3.0"

RPM_NAME = "python311-Flask-Mailman-0.3.0-2.3.noarch.rpm"
RPM_HASH = "197e02829a8c33b3120a789a11e0cf6ecf33c15c22ab3897c97fa74bc47302536ec18b4bf961db29f5edb313d20a4ee58f2f27259808118333d9ef95b2e98e9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-Mailman \
python3.11dist-flask-mailman \
python311-Flask-Mailman \
python3dist-flask-mailman"

RDEPENDS:${PN} += "python-abi \
python311-Flask"

inherit rpm
