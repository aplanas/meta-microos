SUMMARY = "A microframework based on Werkzeug, Jinja2 and good intentions"
DESCRIPTION = "Flask is a microframework for Python based on Werkzeug, Jinja 2 and good \
intentions. And before you ask: It's BSD licensed!"
LICENSE = "BSD-3-Clause"

PV = "2.3.2"

RPM_NAME = "python310-Flask-2.3.2-2.1.noarch.rpm"
RPM_HASH = "5ed54a5b5b5f73718a2a5e8ca7400df0d22b471c45ac28e267ddf2e85207d7ac5fa3f3509f2fd57d3b6fd793efc62e290844e84e74bb688aa4411226b741dbc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flask \
python310-Flask \
python3dist-flask"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
alts \
python-abi \
python310-Jinja2 \
python310-Werkzeug \
python310-blinker \
python310-click \
python310-itsdangerous"

inherit rpm
