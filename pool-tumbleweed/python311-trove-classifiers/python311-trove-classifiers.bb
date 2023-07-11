SUMMARY = "Canonical source for classifiers on PyPI"
DESCRIPTION = "Classifiers categorize projects per PEP 301. Use this package to validate classifiers in packages for PyPI upload or download."
LICENSE = "Apache-2.0"

PV = "2023.5.2"

RPM_NAME = "python311-trove-classifiers-2023.5.2-1.3.noarch.rpm"
RPM_HASH = "5debfe3592f3a8bc966f3b006a65e0d8bc045a2834de18ea391b1f561d286c3f4104ef358a66eb3e8b8481c1761531cc13008f729f843849fed89f29e5bf4323"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-trove-classifiers \
python3.11dist-trove-classifiers \
python311-trove-classifiers \
python3dist-trove-classifiers"

RDEPENDS:${PN} += "python-abi"

inherit rpm
