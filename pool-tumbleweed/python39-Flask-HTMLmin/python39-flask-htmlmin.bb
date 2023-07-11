SUMMARY = "Flask minifier for HTML responses"
DESCRIPTION = "Flask-HTMLmin minimizes HTML rendered by Flask."
LICENSE = "BSD-3-Clause"

PV = "2.2.0"

RPM_NAME = "python39-Flask-HTMLmin-2.2.0-1.5.noarch.rpm"
RPM_HASH = "0782080cf06caa822f38b34265b7969997dee6ed2bb94589707ce7da213f90ec32ddcdfe635096714f3ae43603c18f8aa71419885a2c516ad601a9444df7efef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flask-htmlmin \
python39-Flask-HTMLmin \
python3dist-flask-htmlmin"

RDEPENDS:${PN} += "python-abi \
python39-Flask \
python39-cssmin \
python39-htmlmin"

inherit rpm
