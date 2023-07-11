SUMMARY = "Python utilities for working with sound signals"
DESCRIPTION = "Scikit-sound contains functions for working with sound"
LICENSE = "BSD-2-Clause"

PV = "0.2.3"

RPM_NAME = "python310-scikit-sound-0.2.3-3.13.noarch.rpm"
RPM_HASH = "bd478c1368e528fd715a6a045163a2fe30b77493cba3fbc0df0ff9c53f3301a73b2f19ede233f7e2509685e814dfaa8bf1d0c26dcca16d3e3a44b1d85bdc3923"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-scikit-sound \
python310-scikit-sound \
python3dist-scikit-sound"

RDEPENDS:${PN} += "python-abi \
python310-PyYAML \
python310-appdirs \
python310-docutils \
python310-pygame \
python310-scipy"

inherit rpm
