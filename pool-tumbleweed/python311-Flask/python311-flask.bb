SUMMARY = "A microframework based on Werkzeug, Jinja2 and good intentions"
DESCRIPTION = "Flask is a microframework for Python based on Werkzeug, Jinja 2 and good \
intentions. And before you ask: It's BSD licensed!"
LICENSE = "BSD-3-Clause"

PV = "2.2.5"

RPM_NAME = "python311-Flask-2.2.5-1.1.noarch.rpm"
RPM_HASH = "e4fce44e4cbf3cae5043d8766e540552344a39af737c54bcdea7ffc0267342daaf469487874a02486e8fdba866ae31adff1b9f8355c555cb6d2e8ff047014c0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-flask \
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
