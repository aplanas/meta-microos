SUMMARY = "i18n and l10n support for Flask"
DESCRIPTION = "This module implements i18n and l10n support for Flask. It is based on \
the Python babel module as well as pytz."
LICENSE = "BSD-3-Clause"

PV = "3.1.0"

RPM_NAME = "python310-Flask-Babel-3.1.0-2.1.noarch.rpm"
RPM_HASH = "aba4815a3c21708ecdb02ecf7f4fe3d8fc57f65ab00b99e798276fd2788066892609326c2ec51ef0a568009882c1ce836870abb052825857c2b35f0ef9ac355b"
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
