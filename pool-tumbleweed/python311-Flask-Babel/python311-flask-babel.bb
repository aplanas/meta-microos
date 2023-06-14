SUMMARY = "i18n and l10n support for Flask"
DESCRIPTION = "This module implements i18n and l10n support for Flask. It is based on \
the Python babel module as well as pytz."
LICENSE = "BSD-3-Clause"

PV = "2.0.0"

RPM_NAME = "python311-Flask-Babel-2.0.0-1.11.noarch.rpm"
RPM_HASH = "02665e577fd26b09f234fce08dba1c1dd8856ce0b12a665a1dfda400fbf49ef89eb48cc353eac592e736600b69b69a1dd391e596a9c7797af8a2436f943c4fe6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-flask-babel \
python311-Flask-Babel \
python3dist-flask-babel"

RDEPENDS:${PN} += "python-abi \
python311-Babel \
python311-Flask \
python311-Jinja2 \
python311-pytz"

inherit rpm
