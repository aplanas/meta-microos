SUMMARY = "Computer algebra system (CAS) in Python"
DESCRIPTION = "SymPy is a Python library for symbolic mathematics. It aims to become \
a full-featured computer algebra system (CAS) while keeping the code \
as simple as possible in order to be comprehensible and easily \
extensible. SymPy is written entirely in Python and does not require \
any external libraries."
LICENSE = "BSD-3-Clause"

PV = "1.11.1"

RPM_NAME = "python311-sympy-1.11.1-1.4.noarch.rpm"
RPM_HASH = "ed4f40406a1b4d809ca47546f085f82de5f4a24ecc310cd8b1fa4525b410a51b7adf5ed922863fab51a13c905bcb82400575263337672901af8e6ad7a28b800b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sympy) \
python311-sympy \
python3dist(sympy)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-mpmath \
python311-setuptools \
update-alternatives"

inherit rpm
