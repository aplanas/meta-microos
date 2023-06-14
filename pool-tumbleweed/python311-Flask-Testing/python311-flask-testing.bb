SUMMARY = "Unit testing for Flask"
DESCRIPTION = "Unit testing for Flask."
LICENSE = "BSD-3-Clause"

PV = "0.8.1"

RPM_NAME = "python311-Flask-Testing-0.8.1-4.3.noarch.rpm"
RPM_HASH = "c78614d7516e97d20f50444e4d7c7f42cc08bdc5681b32cc40725e30e61223dffb1998e18a4b6ff48443f9aa850d1a0eed8d47dc0f951d7a243a8f7bed255892"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-flask-testing \
python311-Flask-Testing \
python3dist-flask-testing"

RDEPENDS:${PN} += "python-abi \
python311-Flask"

inherit rpm
