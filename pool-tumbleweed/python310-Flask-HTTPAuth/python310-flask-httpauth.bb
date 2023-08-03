SUMMARY = "Basic and Digest HTTP authentication for Flask routes"
DESCRIPTION = "Simple extension that provides Basic and Digest HTTP authentication for Flask routes."
LICENSE = "MIT"

PV = "4.8.0"

RPM_NAME = "python310-Flask-HTTPAuth-4.8.0-1.1.noarch.rpm"
RPM_HASH = "18592b262428106ba9fc6daf35eec8dfb8aa935241e3c441fe1b2b923bbd676e9a9968506cb2a481556437c68f4f1b02c72d4728ce4dadc3edb440eca3e18e19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flask-httpauth \
python310-Flask-HTTPAuth \
python3dist-flask-httpauth"

RDEPENDS:${PN} += "python-abi \
python310-Flask"

inherit rpm
