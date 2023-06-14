SUMMARY = "Library for Parsing ICU MessageFormat Messages"
DESCRIPTION = "An unopinionated library for parsing ICU MessageFormat messages \
into both ASTs and, optionally, token lists. \
 \
This library is mainly a re-implementation of the JavaScript library \
format-message-parse with a few extra configuration flags."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-pyicumessageformat-1.0.0-1.15.noarch.rpm"
RPM_HASH = "e6f6423c4288993d2c76422afb0f59f18c1d0733a9a56fa398b1a9dd115c059ed2b21163625b2ce8dd1c9f6de637259b4b892b090391dd9c9199e84958348401"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyicumessageformat \
python3.10dist-pyicumessageformat \
python310-pyicumessageformat \
python3dist-pyicumessageformat"

RDEPENDS:${PN} += "python-abi"

inherit rpm
