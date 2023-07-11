SUMMARY = "Canonical source for classifiers on PyPI"
DESCRIPTION = "Classifiers categorize projects per PEP 301. Use this package to validate classifiers in packages for PyPI upload or download."
LICENSE = "Apache-2.0"

PV = "2023.5.2"

RPM_NAME = "python310-trove-classifiers-2023.5.2-1.3.noarch.rpm"
RPM_HASH = "c7c1bd91946ce73c8bf33fd13e885616a2da7553c8c71b7c7fffac6fb78171c2cc7e9d3717e80feb06f9afa15141ff5499f8fe8f358c5f48211bf897fe5fedae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-trove-classifiers \
python310-trove-classifiers \
python3dist-trove-classifiers"

RDEPENDS:${PN} += "python-abi"

inherit rpm
