SUMMARY = "An implementation of contracts for Python"
DESCRIPTION = "This module provides a collection of decorators for \
writing software using contracts. \
 \
Contracts are a debugging and verification tool.  They are declarative \
statements about what states a program must be in to be considered \
'correct' at runtime.  They are similar to assertions, and are verified \
automatically at various well-defined points in the program.  Contracts can \
be specified on functions and on classes."
LICENSE = "LGPL-3.0-or-later"

PV = "0.6.0"

RPM_NAME = "python311-dpcontracts-0.6.0-3.2.noarch.rpm"
RPM_HASH = "e1ccbc3293bd9517f73edd089af5948215a8628b69c7716fb303970b8a2891fcd5599b4a87b6c69699d9d5421b6f250e9cb74c28c11f8f267e875833ef2ccda2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dpcontracts \
python3.11dist-dpcontracts \
python311-dpcontracts \
python3dist-dpcontracts"

RDEPENDS:${PN} += "python-abi"

inherit rpm
