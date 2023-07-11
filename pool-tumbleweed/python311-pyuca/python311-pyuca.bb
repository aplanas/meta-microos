SUMMARY = "Python implementation of the Unicode Collation Algorithm"
DESCRIPTION = "This is a Python implementation of the Unicode Collation Algorithm (UCA). It \
passes 100% of the UCA conformances tests for Unicode 6.3.0 with a \
variable-weighting setting of Non-ignorable."
LICENSE = "MIT"

PV = "1.2"

RPM_NAME = "python311-pyuca-1.2-4.13.noarch.rpm"
RPM_HASH = "2d05a3fb0773e3aeae40e2d625a3d4306bdafa9b68469fcadc41e62edcd2fc47cdc1e5cf425ff77ae743bd6615df1815f918ee28848640d573d1a7977cbfda14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyuca \
python3.11dist-pyuca \
python311-pyuca \
python3dist-pyuca"

RDEPENDS:${PN} += "python-abi"

inherit rpm
