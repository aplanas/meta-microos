SUMMARY = "Security for Flask apps"
DESCRIPTION = "Flask-Security-Too is a Python module to add security features to a Flask \
application. This is a independently maintained version of Flask-Security \
based on the 3.0.0 version of the original."
LICENSE = "MIT"

PV = "5.1.1"

RPM_NAME = "python39-Flask-Security-Too-5.1.1-2.3.noarch.rpm"
RPM_HASH = "d10a200f3cd77fdd963e4c467f1588fc073a90f038123d8ec504da0d47a67e190c793030080bbf60302abc420e959d03d423550622b2bf0dc4d357c3dd1fef2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flask-security-too \
python39-Flask-Security \
python39-Flask-Security-Too \
python3dist-flask-security-too"

RDEPENDS:${PN} += "python-abi \
python39-Flask \
python39-Flask-Babel \
python39-Flask-Login \
python39-Flask-Principal \
python39-Flask-WTF \
python39-Werkzeug \
python39-bcrypt \
python39-bleach \
python39-blinker \
python39-cryptography \
python39-email-validator \
python39-itsdangerous \
python39-passlib"

inherit rpm
