SUMMARY = "A Flask extension adding a decorator for CORS support"
DESCRIPTION = "A Flask extension for handling Cross Origin Resource Sharing (CORS), \
making cross-origin AJAX possible."
LICENSE = "MIT"

PV = "3.0.10"

RPM_NAME = "python39-Flask-Cors-3.0.10-4.3.noarch.rpm"
RPM_HASH = "dc500dd362f3a4873b8f80252ed3008b12e0b86f440df1a6b2e9da2b3622ad5f242bb1d46a2824bbdd8b0c2764ce49bef24b69ae0a12541208077661905aea4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flask-cors \
python39-Flask-Cors \
python3dist-flask-cors"

RDEPENDS:${PN} += "python-abi \
python39-Flask \
python39-six"

inherit rpm
