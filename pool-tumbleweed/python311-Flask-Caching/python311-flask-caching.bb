SUMMARY = "Adds caching support to your Flask application"
DESCRIPTION = "Adds caching support to your Flask application. Continuation of the Flask-Cache \
Extension."
LICENSE = "BSD-3-Clause"

PV = "1.9.0"

RPM_NAME = "python311-Flask-Caching-1.9.0-1.12.noarch.rpm"
RPM_HASH = "8f840230a484d86754d7b9de2dd7f82f969b053228d720e0b2c9a460c7c4a231beb0cd01795dd00b82819953675d998421b57d73b762cbbd8ccf38346663cf70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(flask-caching) \
python311-Flask-Caching \
python3dist(flask-caching)"

RDEPENDS:${PN} += "python(abi) \
python311-Flask"

inherit rpm
