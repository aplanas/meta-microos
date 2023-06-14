SUMMARY = "A Flask extension adding a decorator for CORS support"
DESCRIPTION = "A Flask extension for handling Cross Origin Resource Sharing (CORS), \
making cross-origin AJAX possible."
LICENSE = "MIT"

PV = "3.0.10"

RPM_NAME = "python311-Flask-Cors-3.0.10-3.6.noarch.rpm"
RPM_HASH = "4157ed81ccdf711fb400c5f2ad2c600db40075409f88d13be5f82715fdf778605aded1ef2be00db78e07270e64e96b7c84390aab920cd1d6ebb8a5fba84f799a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-flask-cors \
python311-Flask-Cors \
python3dist-flask-cors"

RDEPENDS:${PN} += "python-abi \
python311-Flask \
python311-six"

inherit rpm
