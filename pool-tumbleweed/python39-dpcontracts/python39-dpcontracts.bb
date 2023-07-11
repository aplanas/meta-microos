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

RPM_NAME = "python39-dpcontracts-0.6.0-3.2.noarch.rpm"
RPM_HASH = "091d1acd31c9a87e8254ae50e0b386717bab5f8496f4be96a41a5cf4bcd1d11a1225b7628ef7f490b019ce50794ebafe9c85213995f385c0403f385b3cf2519a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-dpcontracts \
python39-dpcontracts \
python3dist-dpcontracts"

RDEPENDS:${PN} += "python-abi"

inherit rpm
