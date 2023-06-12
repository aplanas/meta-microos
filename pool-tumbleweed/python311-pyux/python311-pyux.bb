SUMMARY = "Utility to check API integrity in python libraries"
DESCRIPTION = "Utility to check API integrity in Python libraries."
LICENSE = "MIT"

PV = "0.0.6"

RPM_NAME = "python311-pyux-0.0.6-1.14.noarch.rpm"
RPM_HASH = "0ba3d416852d70fc0b539c6ff93845aaed6fe604d43459bdca878633c053caaba8723d9b4afc2500a939cc3732427d53e89772af60ec7f9a02956af8686d7cd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyux) \
python311-pyux \
python3dist(pyux)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
