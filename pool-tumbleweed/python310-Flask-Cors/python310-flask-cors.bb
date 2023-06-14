SUMMARY = "A Flask extension adding a decorator for CORS support"
DESCRIPTION = "A Flask extension for handling Cross Origin Resource Sharing (CORS), \
making cross-origin AJAX possible."
LICENSE = "MIT"

PV = "3.0.10"

RPM_NAME = "python310-Flask-Cors-3.0.10-3.6.noarch.rpm"
RPM_HASH = "89819b09a62805bc8b2fda946c8ae2c47a649cb17c18edae0a2e1ff3a6e5bb7750ebbb0495a950581b3c618bc16570ea75a6f09bcc6149307d5ffd9eb8065542"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-Cors \
python3.10dist-flask-cors \
python310-Flask-Cors \
python3dist-flask-cors"

RDEPENDS:${PN} += "python-abi \
python310-Flask \
python310-six"

inherit rpm
