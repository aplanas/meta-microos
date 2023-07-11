SUMMARY = "Security for Flask apps"
DESCRIPTION = "Flask-Security-Too is a Python module to add security features to a Flask \
application. This is a independently maintained version of Flask-Security \
based on the 3.0.0 version of the original."
LICENSE = "MIT"

PV = "5.1.1"

RPM_NAME = "python310-Flask-Security-Too-5.1.1-2.3.noarch.rpm"
RPM_HASH = "cf99c9b9d6037530cd4299a15f845cb72118c95bec335e8427248db170d675d49d90af2e8de7634fe1601c7bf57a4d231908bc3f2bdec43cd76093f0dad5ab8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flask-security-too \
python310-Flask-Security \
python310-Flask-Security-Too \
python3dist-flask-security-too"

RDEPENDS:${PN} += "python-abi \
python310-Flask \
python310-Flask-Babel \
python310-Flask-Login \
python310-Flask-Principal \
python310-Flask-WTF \
python310-Werkzeug \
python310-bcrypt \
python310-bleach \
python310-blinker \
python310-cryptography \
python310-email-validator \
python310-itsdangerous \
python310-passlib"

inherit rpm
