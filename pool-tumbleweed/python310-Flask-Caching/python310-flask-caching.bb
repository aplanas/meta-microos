SUMMARY = "Adds caching support to your Flask application"
DESCRIPTION = "Adds caching support to your Flask application. Continuation of the Flask-Cache \
Extension."
LICENSE = "BSD-3-Clause"

PV = "1.9.0"

RPM_NAME = "python310-Flask-Caching-1.9.0-1.14.noarch.rpm"
RPM_HASH = "e39fe3ff775d33cc6d3685b3c74be606074f8efc5e298d15be104eb86ca311fe4d132427ea565ba8d53f56798928f39fdf8cd8973922041ff8c98fd0e4371d3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flask-caching \
python310-Flask-Caching \
python3dist-flask-caching"

RDEPENDS:${PN} += "python-abi \
python310-Flask"

inherit rpm
