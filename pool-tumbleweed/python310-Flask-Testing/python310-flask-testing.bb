SUMMARY = "Unit testing for Flask"
DESCRIPTION = "Unit testing for Flask."
LICENSE = "BSD-3-Clause"

PV = "0.8.1"

RPM_NAME = "python310-Flask-Testing-0.8.1-4.5.noarch.rpm"
RPM_HASH = "208c9af4a82b906fb4ebb6cf65761a66a9dc66153daa480d961476f530e0cefb58916f07d29bb3c15942da1df33a10ec87b809a16fcf4f1afa88367e825e2fbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flask-testing \
python310-Flask-Testing \
python3dist-flask-testing"

RDEPENDS:${PN} += "python-abi \
python310-Flask"

inherit rpm
