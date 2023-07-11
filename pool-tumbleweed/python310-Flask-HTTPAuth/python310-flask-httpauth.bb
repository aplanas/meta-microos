SUMMARY = "Basic and Digest HTTP authentication for Flask routes"
DESCRIPTION = "Simple extension that provides Basic and Digest HTTP authentication for Flask routes."
LICENSE = "MIT"

PV = "4.4.0"

RPM_NAME = "python310-Flask-HTTPAuth-4.4.0-2.10.noarch.rpm"
RPM_HASH = "513c15c29be6faf287150d094b28bf67213ad538589aaf5b42deb0c2aaf55fbe9fe512a8b7d167dfc3763d8f1733ee4b0163693239b89e6042ef09f6e2cd948e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flask-httpauth \
python310-Flask-HTTPAuth \
python3dist-flask-httpauth"

RDEPENDS:${PN} += "python-abi \
python310-Flask"

inherit rpm
