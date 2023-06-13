SUMMARY = "Python implementation of the Unicode Collation Algorithm"
DESCRIPTION = "This is a Python implementation of the Unicode Collation Algorithm (UCA). It \
passes 100% of the UCA conformances tests for Unicode 6.3.0 with a \
variable-weighting setting of Non-ignorable."
LICENSE = "MIT"

PV = "1.2"

RPM_NAME = "python39-pyuca-1.2-4.12.noarch.rpm"
RPM_HASH = "cc240ebb6fffc57a4480a668d1fa1c31723e737d959a88f01e30a2d65f992c5b537edbe0ade0bfcb946700a907e7a3fcd139adeebf88f0a9500eec017b467d78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pyuca) \
python39-pyuca \
python3dist(pyuca)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
