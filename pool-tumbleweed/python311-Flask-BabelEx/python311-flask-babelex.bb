SUMMARY = "i18n/l10n support for Flask applications"
DESCRIPTION = "This package adds i18n/l10n support to Flask applications with the help of the Babel library. \
This is a fork of the official Flask-Babel extension with some more features."
LICENSE = "BSD-3-Clause"

PV = "0.9.4"

RPM_NAME = "python311-Flask-BabelEx-0.9.4-1.14.noarch.rpm"
RPM_HASH = "89dfae15f2e28a6e41f88d6fdaadbe006414d456de6041b39baa778ce7a1214d4ffa7635301885c283ad8052e29e39484ba77f51c11cdb6abcc18de7641ce3ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(flask-babelex) \
python311-Flask-BabelEx \
python3dist(flask-babelex)"

RDEPENDS:${PN} += "python(abi) \
python311-Babel \
python311-Flask \
python311-Jinja2 \
python311-speaklater"

inherit rpm
