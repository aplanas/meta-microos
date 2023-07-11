SUMMARY = "A microframework based on Werkzeug, Jinja2 and good intentions"
DESCRIPTION = "Flask is a microframework for Python based on Werkzeug, Jinja 2 and good \
intentions. And before you ask: It's BSD licensed!"
LICENSE = "BSD-3-Clause"

PV = "2.2.5"

RPM_NAME = "python310-Flask-2.2.5-1.3.noarch.rpm"
RPM_HASH = "83226adaf1690907eb48d426398fbedc23659c93c846a9baaf5fed8f45a35f9ab3a10d0fa55ed3d379293dc5d0c776f77ecb54742828e0e049f8eb3efc7c0c00"
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
python310-click \
python310-itsdangerous"

inherit rpm
