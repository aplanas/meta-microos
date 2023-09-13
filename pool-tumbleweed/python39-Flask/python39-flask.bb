SUMMARY = "A microframework based on Werkzeug, Jinja2 and good intentions"
DESCRIPTION = "Flask is a microframework for Python based on Werkzeug, Jinja 2 and good \
intentions. And before you ask: It's BSD licensed!"
LICENSE = "BSD-3-Clause"

PV = "2.3.2"

RPM_NAME = "python39-Flask-2.3.2-2.1.noarch.rpm"
RPM_HASH = "7d64f61373dadcbf1c3b7457d4ef2c4c6b9b7c360ea54c89ff343b9fd38f5faef9a386c6add5a00ea44c662b4ef9b57ddc044981b47add275cd1266bf7b02e10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flask \
python39-Flask \
python3dist-flask"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
alts \
python-abi \
python39-Jinja2 \
python39-Werkzeug \
python39-blinker \
python39-click \
python39-importlib-metadata \
python39-itsdangerous"

inherit rpm
