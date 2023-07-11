SUMMARY = "Basic and Digest HTTP authentication for Flask routes"
DESCRIPTION = "Simple extension that provides Basic and Digest HTTP authentication for Flask routes."
LICENSE = "MIT"

PV = "4.4.0"

RPM_NAME = "python311-Flask-HTTPAuth-4.4.0-2.10.noarch.rpm"
RPM_HASH = "34dd8da50d2f8f779a58c0b332a684e9fd584eea4b13435e98842efb44a833d20e7c2a750ecc87b6c7b04f8f52a1679546a4b138bdf7943dac2405d167e68342"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-HTTPAuth \
python3.11dist-flask-httpauth \
python311-Flask-HTTPAuth \
python3dist-flask-httpauth"

RDEPENDS:${PN} += "python-abi \
python311-Flask"

inherit rpm
