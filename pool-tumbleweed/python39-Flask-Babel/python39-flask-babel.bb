SUMMARY = "i18n and l10n support for Flask"
DESCRIPTION = "This module implements i18n and l10n support for Flask. It is based on \
the Python babel module as well as pytz."
LICENSE = "BSD-3-Clause"

PV = "2.0.0"

RPM_NAME = "python39-Flask-Babel-2.0.0-1.11.noarch.rpm"
RPM_HASH = "079db69a40d5a38e55c6b9fea5be618368b90ab8f26125b2fb25ee1d1bce109d7cb9c67a74179cd1635573ea4fe335e4841d85eaa813c1c4b6c75215a5d795f9"
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
