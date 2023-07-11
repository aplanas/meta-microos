SUMMARY = "Python implementation of the Unicode Collation Algorithm"
DESCRIPTION = "This is a Python implementation of the Unicode Collation Algorithm (UCA). It \
passes 100% of the UCA conformances tests for Unicode 6.3.0 with a \
variable-weighting setting of Non-ignorable."
LICENSE = "MIT"

PV = "1.2"

RPM_NAME = "python39-pyuca-1.2-4.13.noarch.rpm"
RPM_HASH = "4f41eda175474bef9e8c100502490741e2d7a0d09717702a8d032ec275f3035ae1fd23d774a6805dd7b7a2036c14c0bf550e4812769f3157f5e68ad7f13f3d67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyuca \
python39-pyuca \
python3dist-pyuca"

RDEPENDS:${PN} += "python-abi"

inherit rpm
