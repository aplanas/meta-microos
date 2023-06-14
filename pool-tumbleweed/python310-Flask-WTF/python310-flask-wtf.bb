SUMMARY = "WTForms support for Flask"
DESCRIPTION = "Adds WTForms support to your Flask application"
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "python310-Flask-WTF-1.0.1-1.6.noarch.rpm"
RPM_HASH = "a6e128de02ec9ac1ca1a0419c7c975520f849f057ccd06abde2e542e25a7c5773a30dc32342a75f4d52ae5591ac25530a139f27b21d0faf7ba2e8b5582de2716"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-WTF \
python3.10dist-flask-wtf \
python310-Flask-WTF \
python3dist-flask-wtf"

RDEPENDS:${PN} += "python-abi \
python310-Flask \
python310-WTForms \
python310-Werkzeug \
python310-itsdangerous"

inherit rpm
