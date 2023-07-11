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

RPM_NAME = "python310-dpcontracts-0.6.0-3.2.noarch.rpm"
RPM_HASH = "6d09e9d7295974426c861b4833af4a92bb5ea03396b3322c08d3a7ac45fdaacb5f45fdadc3c8ab330745728963d67c9515ec6838257de55b2ae24269352d3643"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-dpcontracts \
python310-dpcontracts \
python3dist-dpcontracts"

RDEPENDS:${PN} += "python-abi"

inherit rpm
