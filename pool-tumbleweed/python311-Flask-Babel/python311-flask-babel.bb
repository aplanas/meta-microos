SUMMARY = "i18n and l10n support for Flask"
DESCRIPTION = "This module implements i18n and l10n support for Flask. It is based on \
the Python babel module as well as pytz."
LICENSE = "BSD-3-Clause"

PV = "3.1.0"

RPM_NAME = "python311-Flask-Babel-3.1.0-2.1.noarch.rpm"
RPM_HASH = "3d190a9745977b4bc6b3d0800db424f78783d2b2bd3bbe0939d7a0b3b88e01c949e2cf06d6f535bbf0dada3fca7f698c009750b35507667dc3a91811ec769e02"
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
