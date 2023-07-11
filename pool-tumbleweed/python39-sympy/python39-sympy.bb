SUMMARY = "Computer algebra system (CAS) in Python"
DESCRIPTION = "SymPy is a Python library for symbolic mathematics. It aims to become \
a full-featured computer algebra system (CAS) while keeping the code \
as simple as possible in order to be comprehensible and easily \
extensible. SymPy is written entirely in Python and does not require \
any external libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12"

RPM_NAME = "python39-sympy-1.12-1.3.noarch.rpm"
RPM_HASH = "6180fb272a6ecc763252d798aa12d211263cce69c31de8817ca5b08d6e5a87f3905170718d375358257b33e48e77f99bb0ed568d571fbabdf8451644cf019251"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sympy \
python39-sympy \
python3dist-sympy"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-mpmath \
python39-setuptools \
update-alternatives"

inherit rpm
