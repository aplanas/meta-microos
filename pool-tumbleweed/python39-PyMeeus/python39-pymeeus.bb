SUMMARY = "Python implementation of Jean Meeus astronomical routines"
DESCRIPTION = "PyMeeus is a Python implementation of the astronomical algorithms \
described in the classical book 'Astronomical Algorithms, 2nd Edition, \
Willmann-Bell Inc. (1998)' by Jean Meeus."
LICENSE = "LGPL-3.0-only"

PV = "0.5.12"

RPM_NAME = "python39-PyMeeus-0.5.12-2.1.noarch.rpm"
RPM_HASH = "97ca69d9cbaf990429d85ca78499f3e3db20cf2021ff6915db1abe71c3637c692fb6dfb0d4c232ee7acaa6908b0007544619175ad4f41c67dc2f10f04a8ca79c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pymeeus \
python39-PyMeeus \
python3dist-pymeeus"

RDEPENDS:${PN} += "python-abi"

inherit rpm
