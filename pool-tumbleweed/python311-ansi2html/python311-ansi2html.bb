SUMMARY = "Python module to convert text with ANSI color codes to HTML or LaTeX"
DESCRIPTION = "A module to convert text with ANSI color codes to HTML or to LaTeX."
LICENSE = "LGPL-3.0-or-later"

PV = "1.8.0"

RPM_NAME = "python311-ansi2html-1.8.0-2.1.noarch.rpm"
RPM_HASH = "556c79ad7d7dbe8a952871e3a0619d4675fdff780da953f31fe0d9eddc1e442dacf7060276d8534dfc76a4e294a48b0f8bcc8f1fcee5f137c916b31f37ed91ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-ansi2html \
python311-ansi2html \
python3dist-ansi2html"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-six \
update-alternatives"

inherit rpm
