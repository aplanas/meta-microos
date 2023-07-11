SUMMARY = "Python implementation of the Unicode Collation Algorithm"
DESCRIPTION = "This is a Python implementation of the Unicode Collation Algorithm (UCA). It \
passes 100% of the UCA conformances tests for Unicode 6.3.0 with a \
variable-weighting setting of Non-ignorable."
LICENSE = "MIT"

PV = "1.2"

RPM_NAME = "python310-pyuca-1.2-4.13.noarch.rpm"
RPM_HASH = "ea85a4b39b60862433b94dba94cfd2c3982c6cac5a939e2362b486a715afbcc83f3d34ea561694abbaa08535bd2d05785c7d483634eadcd1a24262c2f9daf5b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyuca \
python310-pyuca \
python3dist-pyuca"

RDEPENDS:${PN} += "python-abi"

inherit rpm
