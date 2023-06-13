SUMMARY = "i18n/l10n support for Flask applications"
DESCRIPTION = "This package adds i18n/l10n support to Flask applications with the help of the Babel library. \
This is a fork of the official Flask-Babel extension with some more features."
LICENSE = "BSD-3-Clause"

PV = "0.9.4"

RPM_NAME = "python310-Flask-BabelEx-0.9.4-1.14.noarch.rpm"
RPM_HASH = "5cb824b9b5a461aba0fafb09a96d7ac2af80ce151bb7ce17beed4d94cf2b185de2ee73d9c3c02f835f06307b52dccff79af11a737ceb3ad6ced7a3409a0f53bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-BabelEx \
python3.10dist(flask-babelex) \
python310-Flask-BabelEx \
python3dist(flask-babelex)"

RDEPENDS:${PN} += "python(abi) \
python310-Babel \
python310-Flask \
python310-Jinja2 \
python310-speaklater"

inherit rpm
