SUMMARY = "Library for Parsing ICU MessageFormat Messages"
DESCRIPTION = "An unopinionated library for parsing ICU MessageFormat messages \
into both ASTs and, optionally, token lists. \
 \
This library is mainly a re-implementation of the JavaScript library \
format-message-parse with a few extra configuration flags."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-pyicumessageformat-1.0.0-1.15.noarch.rpm"
RPM_HASH = "4d07a870299361a0a9a6ab6a0fe53b80623ebd63a4c6ed5bba3eefc39428a768f00866b989641009d53d3ecd0618ef9e2a134322681f64cb2975275d930f4917"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyicumessageformat \
python39-pyicumessageformat \
python3dist-pyicumessageformat"

RDEPENDS:${PN} += "python-abi"

inherit rpm
