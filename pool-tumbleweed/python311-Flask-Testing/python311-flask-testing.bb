SUMMARY = "Unit testing for Flask"
DESCRIPTION = "Unit testing for Flask."
LICENSE = "BSD-3-Clause"

PV = "0.8.1"

RPM_NAME = "python311-Flask-Testing-0.8.1-4.5.noarch.rpm"
RPM_HASH = "8be3848c87b0e6a39f141d628d18169ebd5e16696d8f1e077fe2054b907d004bae02ec791a40e5310c9e2ef97a4fbc827eb63a688bc68577db46dda26477cbbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-Testing \
python3.11dist-flask-testing \
python311-Flask-Testing \
python3dist-flask-testing"

RDEPENDS:${PN} += "python-abi \
python311-Flask"

inherit rpm
