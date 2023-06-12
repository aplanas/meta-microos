SUMMARY = "Security for Flask apps"
DESCRIPTION = "Flask-Security-Too is a Python module to add security features to a Flask \
application. This is a independently maintained version of Flask-Security \
based on the 3.0.0 version of the original."
LICENSE = "MIT"

PV = "5.1.1"

RPM_NAME = "python310-Flask-Security-Too-5.1.1-2.1.noarch.rpm"
RPM_HASH = "fbc849c73efa8cd26b88358fd42b90517be914567be0b8ed88aca1231504ddf71d3a203a1b92ef953a458f88ac9d2b6421031128267568dd8ed5e4079bdab593"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-Security \
python3-Flask-Security-Too \
python3.10dist(flask-security-too) \
python310-Flask-Security \
python310-Flask-Security-Too \
python3dist(flask-security-too)"
RDEPENDS:${PN} += "python(abi) \
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
