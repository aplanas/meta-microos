SUMMARY = "Basic and Digest HTTP authentication for Flask routes"
DESCRIPTION = "Simple extension that provides Basic and Digest HTTP authentication for Flask routes."
LICENSE = "MIT"

PV = "4.4.0"

RPM_NAME = "python311-Flask-HTTPAuth-4.4.0-2.8.noarch.rpm"
RPM_HASH = "c3a1fe91873b1da672eb5c33dfbb3b8fc7c57697c47575756cee5782531b71a21ab176f6c8ef65cd918050f4b52314912faf1b5a0165c17f0cba16980c94473a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(flask-httpauth) \
python311-Flask-HTTPAuth \
python3dist(flask-httpauth)"

RDEPENDS:${PN} += "python(abi) \
python311-Flask"

inherit rpm
