SUMMARY = "WTForms support for Flask"
DESCRIPTION = "Adds WTForms support to your Flask application"
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "python311-Flask-WTF-1.0.1-1.6.noarch.rpm"
RPM_HASH = "79ce82ec056fb6178f0f9d612c8bef7afa2429550299a72e7191a11696213163c420927318a08a6ad4600a92d13e9dfe492fca040242ee79065a5cbd05a269eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(flask-wtf) \
python311-Flask-WTF \
python3dist(flask-wtf)"

RDEPENDS:${PN} += "python(abi) \
python311-Flask \
python311-WTForms \
python311-Werkzeug \
python311-itsdangerous"

inherit rpm
