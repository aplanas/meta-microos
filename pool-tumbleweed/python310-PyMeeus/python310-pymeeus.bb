SUMMARY = "Python implementation of Jean Meeus astronomical routines"
DESCRIPTION = "PyMeeus is a Python implementation of the astronomical algorithms \
described in the classical book 'Astronomical Algorithms, 2nd Edition, \
Willmann-Bell Inc. (1998)' by Jean Meeus."
LICENSE = "LGPL-3.0-only"

PV = "0.5.12"

RPM_NAME = "python310-PyMeeus-0.5.12-2.3.noarch.rpm"
RPM_HASH = "e9cc89a31b9d7acd9d85b675b0345c21e458699e111436d2a408234834e588a80ee4224ca6fa6110f18f0394837a740af82dd4e03fd0fe25bbb39e09e8895771"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pymeeus \
python310-PyMeeus \
python3dist-pymeeus"

RDEPENDS:${PN} += "python-abi"

inherit rpm
