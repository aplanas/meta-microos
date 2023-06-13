SUMMARY = "A library for automatically generating command line interfaces"
DESCRIPTION = "Python Fire is a library for automatically generating command line \
interfaces (CLIs) from a Python object."
LICENSE = "Apache-2.0"

PV = "0.5.0"

RPM_NAME = "python310-fire-0.5.0-1.3.noarch.rpm"
RPM_HASH = "744f5e08fcf74e907caaf952b669934fae51f4f9007a7e0ab39cdfdb1e34a94a32d68998f8c29fa69304fcd7d95810c73a4146d7e852d4eb29bd298a14580627"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fire \
python3.10dist(fire) \
python310-fire \
python3dist(fire)"

RDEPENDS:${PN} += "python(abi) \
python310-six \
python310-termcolor"

inherit rpm
