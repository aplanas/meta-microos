SUMMARY = "i18n and l10n support for Flask"
DESCRIPTION = "This module implements i18n and l10n support for Flask. It is based on \
the Python babel module as well as pytz."
LICENSE = "BSD-3-Clause"

PV = "3.1.0"

RPM_NAME = "python39-Flask-Babel-3.1.0-2.1.noarch.rpm"
RPM_HASH = "b27d4da195357666837e253658eba9950b37075b51353989ecb8cfa5eb19962e042c60053baaa63e815427d4380cb56d35048f170fcff54f8c9cce25b9a845d9"
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
