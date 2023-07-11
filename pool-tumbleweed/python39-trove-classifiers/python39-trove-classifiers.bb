SUMMARY = "Canonical source for classifiers on PyPI"
DESCRIPTION = "Classifiers categorize projects per PEP 301. Use this package to validate classifiers in packages for PyPI upload or download."
LICENSE = "Apache-2.0"

PV = "2023.5.2"

RPM_NAME = "python39-trove-classifiers-2023.5.2-1.3.noarch.rpm"
RPM_HASH = "a29ae33181669a31b745fc6052ca69869a927911dbe1abae5d149f74cc523e7ed0c7a05de7933e89bdbe91a9da1c2c9231b4359b55e4ed1a895e70eec47a1126"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-trove-classifiers \
python39-trove-classifiers \
python3dist-trove-classifiers"

RDEPENDS:${PN} += "python-abi"

inherit rpm
