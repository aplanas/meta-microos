SUMMARY = "A microframework based on Werkzeug, Jinja2 and good intentions"
DESCRIPTION = "Flask is a microframework for Python based on Werkzeug, Jinja 2 and good \
intentions. And before you ask: It's BSD licensed!"
LICENSE = "BSD-3-Clause"

PV = "2.3.2"

RPM_NAME = "python39-Flask-2.3.2-1.1.noarch.rpm"
RPM_HASH = "07376c93c57f7f1687864c4caba1caf9fba0722c34ede8f8c3b0efda1841cc4c59d0a8fb1191b190153cb29f59cbe222aed17a05e9c908f67994928c0402b9fc"
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
