SUMMARY = "A Flask extension adding a decorator for CORS support"
DESCRIPTION = "A Flask extension for handling Cross Origin Resource Sharing (CORS), \
making cross-origin AJAX possible."
LICENSE = "MIT"

PV = "3.0.10"

RPM_NAME = "python311-Flask-Cors-3.0.10-4.3.noarch.rpm"
RPM_HASH = "ab2859c712790ecf962b9bbc4bb24c3e06ba1bb09c6c7bb613865b3fd5fbc9c4859f9104ddaa7a1317be0ed6752bba6490107d0f99e0acb82845df68fb1344eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-Cors \
python3.11dist-flask-cors \
python311-Flask-Cors \
python3dist-flask-cors"

RDEPENDS:${PN} += "python-abi \
python311-Flask \
python311-six"

inherit rpm
