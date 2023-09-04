SUMMARY = "A microframework based on Werkzeug, Jinja2 and good intentions"
DESCRIPTION = "Flask is a microframework for Python based on Werkzeug, Jinja 2 and good \
intentions. And before you ask: It's BSD licensed!"
LICENSE = "BSD-3-Clause"

PV = "2.3.2"

RPM_NAME = "python310-Flask-2.3.2-1.1.noarch.rpm"
RPM_HASH = "deb832bbf9f6cd33698a3d93064596e8686a979b9a07db8cd12acb5b880b45d5715cb6d1d87e5fb6ebbaa918ffaa1e6d40a4a45a6946109bbfc9eac3d833a0ad"
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
