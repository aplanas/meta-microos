SUMMARY = "WTForms support for Flask"
DESCRIPTION = "Adds WTForms support to your Flask application"
LICENSE = "BSD-3-Clause"

PV = "1.1.1"

RPM_NAME = "python311-Flask-WTF-1.1.1-1.1.noarch.rpm"
RPM_HASH = "16675d15aa1bea5b02ad4f9f7c387bdaa1a19561ee134b0a5c23e78276ebcc4bc0bda579340959f3878d42b8c2c64cbd7310c415904b1d57b42c3d8e9f6c550f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-WTF \
python3.11dist-flask-wtf \
python311-Flask-WTF \
python3dist-flask-wtf"

RDEPENDS:${PN} += "python-abi \
python311-Flask \
python311-WTForms \
python311-Werkzeug \
python311-itsdangerous"

inherit rpm
