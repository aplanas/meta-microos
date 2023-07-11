SUMMARY = "Computer algebra system (CAS) in Python"
DESCRIPTION = "SymPy is a Python library for symbolic mathematics. It aims to become \
a full-featured computer algebra system (CAS) while keeping the code \
as simple as possible in order to be comprehensible and easily \
extensible. SymPy is written entirely in Python and does not require \
any external libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12"

RPM_NAME = "python311-sympy-1.12-1.3.noarch.rpm"
RPM_HASH = "47cf18e8a3941569dbb6b08678c2bfa3fa306439d53ea056630f9d179ddb239a738bba39dba356e829a8234e5f495bb59095700af1e9d5d91f61728729941c9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sympy \
python3.11dist-sympy \
python311-sympy \
python3dist-sympy"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-mpmath \
python311-setuptools \
update-alternatives"

inherit rpm
