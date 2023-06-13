SUMMARY = "Flask minifier for HTML responses"
DESCRIPTION = "Flask-HTMLmin minimizes HTML rendered by Flask."
LICENSE = "BSD-3-Clause"

PV = "2.2.0"

RPM_NAME = "python39-Flask-HTMLmin-2.2.0-1.3.noarch.rpm"
RPM_HASH = "cfa21ef712c6186924983cfdae1607c7a6860c20d69b4cc346e389af2cfe3c6754fbc44d183b41f034958b591f6df6b65fe59b8814327a788a734d4b7dd091ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(flask-htmlmin) \
python39-Flask-HTMLmin \
python3dist(flask-htmlmin)"

RDEPENDS:${PN} += "python(abi) \
python39-Flask \
python39-cssmin \
python39-htmlmin"

inherit rpm
