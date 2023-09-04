SUMMARY = "A microframework based on Werkzeug, Jinja2 and good intentions"
DESCRIPTION = "Flask is a microframework for Python based on Werkzeug, Jinja 2 and good \
intentions. And before you ask: It's BSD licensed!"
LICENSE = "BSD-3-Clause"

PV = "2.3.2"

RPM_NAME = "python311-Flask-2.3.2-1.1.noarch.rpm"
RPM_HASH = "4ab8e7d4964b7b37f3b0b3cfe62b852c99af5d91706a3c391630b0c386465d88fb3bc145631a860ba669a909de7d5ec5f675b23b97e2c62bacace3a5607e57e8"
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
