SUMMARY = "Adds caching support to your Flask application"
DESCRIPTION = "Adds caching support to your Flask application. Continuation of the Flask-Cache \
Extension."
LICENSE = "BSD-3-Clause"

PV = "1.9.0"

RPM_NAME = "python39-Flask-Caching-1.9.0-1.12.noarch.rpm"
RPM_HASH = "20bcdc03b9883bb5cf8cf41cac56b33c86fbe206ab90ad286c4e38ae3ee1a3c5347ae53896acadea4860952e8ff0010dc20b151b15941144ef7335b54f4a54f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(flask-caching) \
python39-Flask-Caching \
python3dist(flask-caching)"

RDEPENDS:${PN} += "python(abi) \
python39-Flask"

inherit rpm
