SUMMARY = "Computer algebra system (CAS) in Python"
DESCRIPTION = "SymPy is a Python library for symbolic mathematics. It aims to become \
a full-featured computer algebra system (CAS) while keeping the code \
as simple as possible in order to be comprehensible and easily \
extensible. SymPy is written entirely in Python and does not require \
any external libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12"

RPM_NAME = "python310-sympy-1.12-1.3.noarch.rpm"
RPM_HASH = "0f47f26454467732105fe6719c710cd0722181e7b2b44e027dad50ffbd630e4ee2bdd3e25e91c99674677cab9931b1b88a52c2dd04a5238b950e0641f298b660"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sympy \
python310-sympy \
python3dist-sympy"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-mpmath \
python310-setuptools \
update-alternatives"

inherit rpm
