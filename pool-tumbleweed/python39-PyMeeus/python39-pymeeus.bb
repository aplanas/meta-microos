SUMMARY = "Python implementation of Jean Meeus astronomical routines"
DESCRIPTION = "PyMeeus is a Python implementation of the astronomical algorithms \
described in the classical book 'Astronomical Algorithms, 2nd Edition, \
Willmann-Bell Inc. (1998)' by Jean Meeus."
LICENSE = "LGPL-3.0-only"

PV = "0.5.12"

RPM_NAME = "python39-PyMeeus-0.5.12-2.3.noarch.rpm"
RPM_HASH = "fc185ac2299bc72690761c456692d68bfad79992ba49aac20b8e1bc19311e19f956c13813d268794662f3cebc603729aad99150fb30f376ddaf77354ac5e09db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pymeeus \
python39-PyMeeus \
python3dist-pymeeus"

RDEPENDS:${PN} += "python-abi"

inherit rpm
