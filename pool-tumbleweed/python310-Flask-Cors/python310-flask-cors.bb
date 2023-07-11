SUMMARY = "A Flask extension adding a decorator for CORS support"
DESCRIPTION = "A Flask extension for handling Cross Origin Resource Sharing (CORS), \
making cross-origin AJAX possible."
LICENSE = "MIT"

PV = "3.0.10"

RPM_NAME = "python310-Flask-Cors-3.0.10-4.3.noarch.rpm"
RPM_HASH = "0128d2448bb9efb3fc4d41968402b25735e093b2f50e24354956b762895b0ed458cb16b6b9c7be61400663f6965c78c9a432bfc799053d305da479ee93abc39b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flask-cors \
python310-Flask-Cors \
python3dist-flask-cors"

RDEPENDS:${PN} += "python-abi \
python310-Flask \
python310-six"

inherit rpm
