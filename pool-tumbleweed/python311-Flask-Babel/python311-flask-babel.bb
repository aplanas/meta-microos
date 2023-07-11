SUMMARY = "i18n and l10n support for Flask"
DESCRIPTION = "This module implements i18n and l10n support for Flask. It is based on \
the Python babel module as well as pytz."
LICENSE = "BSD-3-Clause"

PV = "3.1.0"

RPM_NAME = "python311-Flask-Babel-3.1.0-1.1.noarch.rpm"
RPM_HASH = "57a048858f050974a1fcced54eb12e85043c038b6c40c163ffa7d1132540c85938606892a6e843c2309c1227fed52b9d94394fe4449abfba71efea522bf89157"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-Babel \
python3.11dist-flask-babel \
python311-Flask-Babel \
python3dist-flask-babel"

RDEPENDS:${PN} += "python-abi \
python311-Babel \
python311-Flask \
python311-Jinja2 \
python311-pytz"

inherit rpm
