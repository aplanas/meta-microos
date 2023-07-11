SUMMARY = "Basic and Digest HTTP authentication for Flask routes"
DESCRIPTION = "Simple extension that provides Basic and Digest HTTP authentication for Flask routes."
LICENSE = "MIT"

PV = "4.4.0"

RPM_NAME = "python39-Flask-HTTPAuth-4.4.0-2.10.noarch.rpm"
RPM_HASH = "00cc522ae8f419c594af0ec93bf5cb6a47dcd1d3bf3c40d018e4e9e1f7e8d54341bf27904602b881fbd4f785bccd28e9e9d06e0e04492904aae7400334b623b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flask-httpauth \
python39-Flask-HTTPAuth \
python3dist-flask-httpauth"

RDEPENDS:${PN} += "python-abi \
python39-Flask"

inherit rpm
