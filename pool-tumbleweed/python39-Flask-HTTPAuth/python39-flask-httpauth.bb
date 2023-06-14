SUMMARY = "Basic and Digest HTTP authentication for Flask routes"
DESCRIPTION = "Simple extension that provides Basic and Digest HTTP authentication for Flask routes."
LICENSE = "MIT"

PV = "4.4.0"

RPM_NAME = "python39-Flask-HTTPAuth-4.4.0-2.8.noarch.rpm"
RPM_HASH = "8519cf8070cd7a7f7fc83f0641a82a00a933c76b52d2432c331d86208f58b2a0a03c3e7829f9d950867bf9c40777f41110c4fa45ecbad06cfc4488034082b629"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flask-httpauth \
python39-Flask-HTTPAuth \
python3dist-flask-httpauth"

RDEPENDS:${PN} += "python-abi \
python39-Flask"

inherit rpm
