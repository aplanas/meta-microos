SUMMARY = "A library for automatically generating command line interfaces"
DESCRIPTION = "Python Fire is a library for automatically generating command line \
interfaces (CLIs) from a Python object."
LICENSE = "Apache-2.0"

PV = "0.5.0"

RPM_NAME = "python310-fire-0.5.0-1.5.noarch.rpm"
RPM_HASH = "40ddd606160ca1f4fe52ec8e0c41822a83520c6171a9e6fa7fcc03deb7d6c834137051839ffc438155f619e97624533d64c31cd1a6b2f90c171611a65d38430b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-fire \
python310-fire \
python3dist-fire"

RDEPENDS:${PN} += "python-abi \
python310-six \
python310-termcolor"

inherit rpm
