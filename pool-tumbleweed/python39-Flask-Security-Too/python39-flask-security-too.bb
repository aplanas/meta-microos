SUMMARY = "Security for Flask apps"
DESCRIPTION = "Flask-Security-Too is a Python module to add security features to a Flask \
application. This is a independently maintained version of Flask-Security \
based on the 3.0.0 version of the original."
LICENSE = "MIT"

PV = "5.3.0"

RPM_NAME = "python39-Flask-Security-Too-5.3.0-1.1.noarch.rpm"
RPM_HASH = "9c58ce3d78a1d285ef5f133ec96eb9a80cf8ae1e14a9c002cb8baa54bfcb4412a59f879ed0f6c6791d2b2a34afdd9c6449d540f10a480100280e1c47aa29b374"
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
python39-WTForms \
python39-Werkzeug \
python39-bcrypt \
python39-bleach \
python39-blinker \
python39-cryptography \
python39-email-validator \
python39-importlib-resources \
python39-itsdangerous \
python39-passlib"

inherit rpm
