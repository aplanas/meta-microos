SUMMARY = "Library for Parsing ICU MessageFormat Messages"
DESCRIPTION = "An unopinionated library for parsing ICU MessageFormat messages \
into both ASTs and, optionally, token lists. \
 \
This library is mainly a re-implementation of the JavaScript library \
format-message-parse with a few extra configuration flags."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-pyicumessageformat-1.0.0-1.17.noarch.rpm"
RPM_HASH = "ffb5e848abd453ae16a5ad8de7baaa8466bde786ba7b950ced5b2faec1bb779d9e3ea0ec41fe8f231285bf4a385f2fd360c35b3fc094df03af9fe4466c9f5cc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyicumessageformat \
python39-pyicumessageformat \
python3dist-pyicumessageformat"

RDEPENDS:${PN} += "python-abi"

inherit rpm
