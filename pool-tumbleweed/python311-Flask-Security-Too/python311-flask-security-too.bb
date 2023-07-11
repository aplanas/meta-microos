SUMMARY = "Security for Flask apps"
DESCRIPTION = "Flask-Security-Too is a Python module to add security features to a Flask \
application. This is a independently maintained version of Flask-Security \
based on the 3.0.0 version of the original."
LICENSE = "MIT"

PV = "5.1.1"

RPM_NAME = "python311-Flask-Security-Too-5.1.1-2.3.noarch.rpm"
RPM_HASH = "4f82e231bd20d73fc5a23355326b4bbc595c0e2af12929710bf969810b5de1a189612364f51b15e6a5a2f449d334d7f032a17387399c3b40fc4a93143d7eb0b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-Security \
python3-Flask-Security-Too \
python3.11dist-flask-security-too \
python311-Flask-Security \
python311-Flask-Security-Too \
python3dist-flask-security-too"

RDEPENDS:${PN} += "python-abi \
python311-Flask \
python311-Flask-Babel \
python311-Flask-Login \
python311-Flask-Principal \
python311-Flask-WTF \
python311-Werkzeug \
python311-bcrypt \
python311-bleach \
python311-blinker \
python311-cryptography \
python311-email-validator \
python311-itsdangerous \
python311-passlib"

inherit rpm
