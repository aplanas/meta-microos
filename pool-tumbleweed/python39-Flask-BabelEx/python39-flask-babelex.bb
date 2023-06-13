SUMMARY = "i18n/l10n support for Flask applications"
DESCRIPTION = "This package adds i18n/l10n support to Flask applications with the help of the Babel library. \
This is a fork of the official Flask-Babel extension with some more features."
LICENSE = "BSD-3-Clause"

PV = "0.9.4"

RPM_NAME = "python39-Flask-BabelEx-0.9.4-1.14.noarch.rpm"
RPM_HASH = "3d25109b6070f3fc4fb9a5bf019cac91d5dff2e710c3982e272e2a41e766bc24f32d354de57ecf9fa4c65a9baff1a870ecd3f07da15102d35e5d2e669df3c3d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(flask-babelex) \
python39-Flask-BabelEx \
python3dist(flask-babelex)"

RDEPENDS:${PN} += "python(abi) \
python39-Babel \
python39-Flask \
python39-Jinja2 \
python39-speaklater"

inherit rpm
