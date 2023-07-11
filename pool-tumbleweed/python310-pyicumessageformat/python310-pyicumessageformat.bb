SUMMARY = "Library for Parsing ICU MessageFormat Messages"
DESCRIPTION = "An unopinionated library for parsing ICU MessageFormat messages \
into both ASTs and, optionally, token lists. \
 \
This library is mainly a re-implementation of the JavaScript library \
format-message-parse with a few extra configuration flags."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-pyicumessageformat-1.0.0-1.17.noarch.rpm"
RPM_HASH = "10e8fb1b0c2ed23e0285eeed8b3466bf2e94e306de78c859f36905fb0e909ac853bbeca7738d1a91e28af7f132b1f98066e71c563a3c20559fd578404ca8d605"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyicumessageformat \
python310-pyicumessageformat \
python3dist-pyicumessageformat"

RDEPENDS:${PN} += "python-abi"

inherit rpm
