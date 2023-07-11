SUMMARY = "A microframework based on Werkzeug, Jinja2 and good intentions"
DESCRIPTION = "Flask is a microframework for Python based on Werkzeug, Jinja 2 and good \
intentions. And before you ask: It's BSD licensed!"
LICENSE = "BSD-3-Clause"

PV = "2.2.5"

RPM_NAME = "python311-Flask-2.2.5-1.3.noarch.rpm"
RPM_HASH = "06943a911ee4a1dfb7f6b64fe974dde89cae6b8477caf193c529e6974757d8de4a185cc84ed7349fe5584b05739d3be02ed582d053a00de4040928decaa08cc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask \
python3.11dist-flask \
python311-Flask \
python3dist-flask"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
alts \
python-abi \
python311-Jinja2 \
python311-Werkzeug \
python311-click \
python311-itsdangerous"

inherit rpm
