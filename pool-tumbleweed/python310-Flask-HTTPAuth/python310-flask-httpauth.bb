SUMMARY = "Basic and Digest HTTP authentication for Flask routes"
DESCRIPTION = "Simple extension that provides Basic and Digest HTTP authentication for Flask routes."
LICENSE = "MIT"

PV = "4.4.0"

RPM_NAME = "python310-Flask-HTTPAuth-4.4.0-2.8.noarch.rpm"
RPM_HASH = "5221f19bcd4fcc06d6003007822cea713da89737464cc1ee3314c80b572e0bae35afe66830139e35203dd01f83c2416f1f39609de3a1822df8ad9722b32aa495"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-HTTPAuth \
python3.10dist(flask-httpauth) \
python310-Flask-HTTPAuth \
python3dist(flask-httpauth)"

RDEPENDS:${PN} += "python(abi) \
python310-Flask"

inherit rpm
