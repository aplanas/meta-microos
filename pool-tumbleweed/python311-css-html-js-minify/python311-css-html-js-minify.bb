SUMMARY = "CSS HTML JS Minifier"
DESCRIPTION = "Async single-file cross-platform no-dependencies Minifier for the Web"
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "2.5.5.git.1523718195.8f72452"

RPM_NAME = "python311-css-html-js-minify-2.5.5.git.1523718195.8f72452-1.15.noarch.rpm"
RPM_HASH = "5eeeebe4752bac77993ad730d2d70be15fc865ae5fe568e184242999e0466a1db5afaa626b5a06041ad3de710c452ac374eef8f39220f21e3b28d467386d9eb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(css-html-js-minify) \
python311-css-html-js-minify \
python3dist(css-html-js-minify)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
update-alternatives"

inherit rpm
