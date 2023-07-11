SUMMARY = "Flask extension providing simple email sending capabilities"
DESCRIPTION = "Flask-Mailman is a Flask extension providing simple email sending capabilities. \
 \
It was meant to replace unmaintained Flask-Mail with a better warranty and \
more features."
LICENSE = "BSD-3-Clause"

PV = "0.3.0"

RPM_NAME = "python310-Flask-Mailman-0.3.0-2.3.noarch.rpm"
RPM_HASH = "4a758444bc057024e51c21adfc1294e367d3561d3b7c6325d40ac0e65b3853e3a9dbe4df04a46a6c6e7650c25b4da9ef249670b32ed25dd6666e1734756f4623"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flask-mailman \
python310-Flask-Mailman \
python3dist-flask-mailman"

RDEPENDS:${PN} += "python-abi \
python310-Flask"

inherit rpm
