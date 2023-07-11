SUMMARY = "i18n and l10n support for Flask"
DESCRIPTION = "This module implements i18n and l10n support for Flask. It is based on \
the Python babel module as well as pytz."
LICENSE = "BSD-3-Clause"

PV = "3.1.0"

RPM_NAME = "python310-Flask-Babel-3.1.0-1.1.noarch.rpm"
RPM_HASH = "71f73a72d1b905de9a8f8d8f8e250c2c151bee3e6bac2d52dc532e6d7c690bacefd3215f90ab31f22194f7a52c9551ccbcb44621026b9eb7b7f5b2e4c36c9138"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flask-babel \
python310-Flask-Babel \
python3dist-flask-babel"

RDEPENDS:${PN} += "python-abi \
python310-Babel \
python310-Flask \
python310-Jinja2 \
python310-pytz"

inherit rpm
