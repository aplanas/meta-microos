SUMMARY = "WTForms support for Flask"
DESCRIPTION = "Adds WTForms support to your Flask application"
LICENSE = "BSD-3-Clause"

PV = "1.1.1"

RPM_NAME = "python39-Flask-WTF-1.1.1-1.1.noarch.rpm"
RPM_HASH = "0c2b87494cbee6c0f59400b81f7e07c3f8ee4a1d22a58f187c9c983eecb29baa2168458d31619c0e98fc5be1c52e72c5219265b2415d73e90c4529aea7b47265"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flask-wtf \
python39-Flask-WTF \
python3dist-flask-wtf"

RDEPENDS:${PN} += "python-abi \
python39-Flask \
python39-WTForms \
python39-Werkzeug \
python39-itsdangerous"

inherit rpm
