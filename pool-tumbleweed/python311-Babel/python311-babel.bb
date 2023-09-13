SUMMARY = "Internationalization utilities"
DESCRIPTION = "A collection of tools for internationalizing Python applications."
LICENSE = "BSD-3-Clause"

PV = "2.12.1"

RPM_NAME = "python311-Babel-2.12.1-2.1.noarch.rpm"
RPM_HASH = "76e35de5d92ee363777052ab977baa3e8b12a89a609eeff3acc3fc534b9e5ecb1bd3b9455b137cc92f5c26c0fce3e20dca9bd384c7d8c0288f809dac2f288558"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Babel \
python3-babel \
python3.11dist-babel \
python311-Babel \
python3dist-babel"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
alts \
python-abi \
python311-pytz"

inherit rpm
