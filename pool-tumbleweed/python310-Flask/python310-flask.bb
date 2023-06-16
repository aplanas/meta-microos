SUMMARY = "A microframework based on Werkzeug, Jinja2 and good intentions"
DESCRIPTION = "Flask is a microframework for Python based on Werkzeug, Jinja 2 and good \
intentions. And before you ask: It's BSD licensed!"
LICENSE = "BSD-3-Clause"

PV = "2.2.5"

RPM_NAME = "python310-Flask-2.2.5-1.1.noarch.rpm"
RPM_HASH = "bd8ca32c0cd61b58e9e94940bad4bcf93c64afd1204cc519ac3835104fac61fbc429fbd3096c60d90473c50fe9cb5e6341e37c9caa5b8738f5bb85551c918716"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask \
python3.10dist-flask \
python310-Flask \
python3dist-flask"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
alts \
python-abi \
python310-Jinja2 \
python310-Werkzeug \
python310-click \
python310-itsdangerous"

inherit rpm
