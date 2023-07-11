SUMMARY = "i18n and l10n support for Flask"
DESCRIPTION = "This module implements i18n and l10n support for Flask. It is based on \
the Python babel module as well as pytz."
LICENSE = "BSD-3-Clause"

PV = "3.1.0"

RPM_NAME = "python39-Flask-Babel-3.1.0-1.1.noarch.rpm"
RPM_HASH = "0aa3cf96228cccccb2314598bc6a094a6c75a6405fc6b17dfd4140dc1186e2f3d048799bf0fc3913af65401da39037547e7afd9190e75c4aadfa59477a9c3837"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flask-babel \
python39-Flask-Babel \
python3dist-flask-babel"

RDEPENDS:${PN} += "python-abi \
python39-Babel \
python39-Flask \
python39-Jinja2 \
python39-pytz"

inherit rpm
