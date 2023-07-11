SUMMARY = "Multivariate normal distribution clustering and utility functions for Octave"
DESCRIPTION = "Multivariate normal distribution clustering and utility functions. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0+"

PV = "1.1.0"

RPM_NAME = "octave-forge-mvn-1.1.0-1.23.noarch.rpm"
RPM_HASH = "2daa15c2b53dbce58590ba4e0e181682ee80e812603c0896ad7f9ede99640b51a2c6bdd7521b465355fe8029b19b3363f3e50d347f8bf9a94a5d72aa499c2fe6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-mvn"

RDEPENDS:${PN} += "/usr/bin/sh \
octave-cli"

inherit rpm
