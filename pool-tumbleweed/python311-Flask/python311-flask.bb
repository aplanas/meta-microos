SUMMARY = "A microframework based on Werkzeug, Jinja2 and good intentions"
DESCRIPTION = "Flask is a microframework for Python based on Werkzeug, Jinja 2 and good \
intentions. And before you ask: It's BSD licensed!"
LICENSE = "BSD-3-Clause"

PV = "2.3.2"

RPM_NAME = "python311-Flask-2.3.2-2.1.noarch.rpm"
RPM_HASH = "330741a3c060f28310d03ad1a8da5a94f53f52fc6435f2778dccb59d044c6f6de369e2d42863c3c3567ff895cff3fd1f273c11ff94cdb075149bd08e6ccd034f"
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
python311-blinker \
python311-click \
python311-itsdangerous"

inherit rpm
