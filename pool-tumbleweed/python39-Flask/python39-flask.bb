SUMMARY = "A microframework based on Werkzeug, Jinja2 and good intentions"
DESCRIPTION = "Flask is a microframework for Python based on Werkzeug, Jinja 2 and good \
intentions. And before you ask: It's BSD licensed!"
LICENSE = "BSD-3-Clause"

PV = "2.2.5"

RPM_NAME = "python39-Flask-2.2.5-1.3.noarch.rpm"
RPM_HASH = "f80dbdfefaaa94439f9177a2f0847394382fc867ef0db5eb364dedc70f9b13cdde196591c710c7e8c043bf93cc635b8b1769580bcb1642015f3a3d52a3a84f9a"
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
python39-click \
python39-importlib-metadata \
python39-itsdangerous"

inherit rpm
