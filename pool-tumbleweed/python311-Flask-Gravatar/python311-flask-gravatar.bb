SUMMARY = "Small extension for Flask to make usage of Gravatar service"
DESCRIPTION = "Small extension for Flask to make usage of the Gravatar service."
LICENSE = "BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "python311-Flask-Gravatar-0.5.0-4.10.noarch.rpm"
RPM_HASH = "d10efd96b939e07fca5bb80722685fc4b213d058e02ae74193b0288bac4326d1ac96e620dd031ff11122166611f82bffd4068b9c3802ed270c65659ad4bcc8f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-Gravatar \
python3.11dist-flask-gravatar \
python311-Flask-Gravatar \
python3dist-flask-gravatar"

RDEPENDS:${PN} += "python-abi \
python311-Flask"

inherit rpm
