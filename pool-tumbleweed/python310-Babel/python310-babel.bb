SUMMARY = "Internationalization utilities"
DESCRIPTION = "A collection of tools for internationalizing Python applications."
LICENSE = "BSD-3-Clause"

PV = "2.12.1"

RPM_NAME = "python310-Babel-2.12.1-1.1.noarch.rpm"
RPM_HASH = "04080d0d4388eb61920c0912064a0c7fdadf1e74fd6b61275f9859f0ab0787a59f1f505e7bb94a7130614ddc712bf7301e4acff377bffb6ac60afc0e94684bd3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Babel \
python3-babel \
python3.10dist(babel) \
python310-Babel \
python3dist(babel)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
alts \
python(abi) \
python310-pytz"

inherit rpm
