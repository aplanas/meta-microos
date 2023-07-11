SUMMARY = "Python package to work with Document Object Identifier (doi)"
DESCRIPTION = "Python package to work with Document Object Identifier (doi)"
LICENSE = "GPL-3.0-only"

PV = "0.2.0"

RPM_NAME = "python310-python-doi-0.2.0-1.5.noarch.rpm"
RPM_HASH = "1e9689308c677f3a5dd14c79d1c1ba860117b85b6cdf7b1a7809757e45354183ccbf22ba2e7427a652ede2e38299f129fda9f0cc933a6961fafa159ad86332ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-doi \
python310-python-doi \
python3dist-python-doi"

RDEPENDS:${PN} += "python-abi"

inherit rpm
