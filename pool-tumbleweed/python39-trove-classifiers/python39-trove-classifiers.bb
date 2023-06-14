SUMMARY = "Canonical source for classifiers on PyPI"
DESCRIPTION = "Classifiers categorize projects per PEP 301. Use this package to validate classifiers in packages for PyPI upload or download."
LICENSE = "Apache-2.0"

PV = "2023.5.2"

RPM_NAME = "python39-trove-classifiers-2023.5.2-1.1.noarch.rpm"
RPM_HASH = "f051eea7373de48acd2562100f590892245e70fbf35d664407f2edce09f83ec8840880ac2e1c6c4de7e18e3449578ceb2e1069be022561631eb76cdf5fba447c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-trove-classifiers \
python39-trove-classifiers \
python3dist-trove-classifiers"

RDEPENDS:${PN} += "python-abi"

inherit rpm
