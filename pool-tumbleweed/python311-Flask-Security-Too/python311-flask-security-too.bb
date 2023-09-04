SUMMARY = "Security for Flask apps"
DESCRIPTION = "Flask-Security-Too is a Python module to add security features to a Flask \
application. This is a independently maintained version of Flask-Security \
based on the 3.0.0 version of the original."
LICENSE = "MIT"

PV = "5.3.0"

RPM_NAME = "python311-Flask-Security-Too-5.3.0-1.1.noarch.rpm"
RPM_HASH = "aabf9b3ff0267df5d2343ae6b6fbefb5f5f4eb8b980724a8e3ccb2b982a8da90d40de5282771a5c8436d71ea07656c668be86fccff035eaec6258aae0d18e8f8"
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
python311-WTForms \
python311-Werkzeug \
python311-bcrypt \
python311-bleach \
python311-blinker \
python311-cryptography \
python311-email-validator \
python311-importlib-resources \
python311-itsdangerous \
python311-passlib"

inherit rpm
