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

RPM_NAME = "python311-dpcontracts-0.6.0-3.1.noarch.rpm"
RPM_HASH = "acf7567fc8b0271a4025d21ea5736271a26828825903df86bab28e57b19aad58c85e38b0d24c762915eae0540462b5bdce0603f63ef8d09453eee66619f48359"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-dpcontracts \
python311-dpcontracts \
python3dist-dpcontracts"

RDEPENDS:${PN} += "python-abi"

inherit rpm
