SUMMARY = "Flask extension providing simple email sending capabilities"
DESCRIPTION = "Flask-Mailman is a Flask extension providing simple email sending capabilities. \
 \
It was meant to replace unmaintained Flask-Mail with a better warranty and \
more features."
LICENSE = "BSD-3-Clause"

PV = "0.3.0"

RPM_NAME = "python39-Flask-Mailman-0.3.0-2.1.noarch.rpm"
RPM_HASH = "cdcf41f419107ffe42420208773b01672939c3f3c52a6afc3f7b3bacf755adfc9418d73af36000900516794a88fb23177653a603cb75d58241e4b9e4a9260f95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flask-mailman \
python39-Flask-Mailman \
python3dist-flask-mailman"

RDEPENDS:${PN} += "python-abi \
python39-Flask"

inherit rpm
