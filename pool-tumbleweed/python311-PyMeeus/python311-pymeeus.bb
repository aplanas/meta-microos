SUMMARY = "Python implementation of Jean Meeus astronomical routines"
DESCRIPTION = "PyMeeus is a Python implementation of the astronomical algorithms \
described in the classical book 'Astronomical Algorithms, 2nd Edition, \
Willmann-Bell Inc. (1998)' by Jean Meeus."
LICENSE = "LGPL-3.0-only"

PV = "0.5.12"

RPM_NAME = "python311-PyMeeus-0.5.12-2.3.noarch.rpm"
RPM_HASH = "53e081b718b0bdd54e02fec2cfacbc0aae345ee0a63b7a81e298cd9407fbb2ec4b9c2c186db73397756e2ed43338210869472cfdd3e4a5f07bc6a7c6b2df3754"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyMeeus \
python3.11dist-pymeeus \
python311-PyMeeus \
python3dist-pymeeus"

RDEPENDS:${PN} += "python-abi"

inherit rpm
