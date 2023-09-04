SUMMARY = "Security for Flask apps"
DESCRIPTION = "Flask-Security-Too is a Python module to add security features to a Flask \
application. This is a independently maintained version of Flask-Security \
based on the 3.0.0 version of the original."
LICENSE = "MIT"

PV = "5.3.0"

RPM_NAME = "python310-Flask-Security-Too-5.3.0-1.1.noarch.rpm"
RPM_HASH = "8f64c0179fda0fb815b972ed40073aa15e91937e22283e56077530160d2afa5db6c45facecb0633294593decd2462c867d5ad2382c1769eeb3262c23cfd6e834"
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
python310-WTForms \
python310-Werkzeug \
python310-bcrypt \
python310-bleach \
python310-blinker \
python310-cryptography \
python310-email-validator \
python310-importlib-resources \
python310-itsdangerous \
python310-passlib"

inherit rpm
