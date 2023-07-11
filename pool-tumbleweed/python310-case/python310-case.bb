SUMMARY = "Python unittest Utilities"
DESCRIPTION = "Python unittest Utilities."
LICENSE = "BSD-3-Clause"

PV = "1.5.3"

RPM_NAME = "python310-case-1.5.3-8.2.noarch.rpm"
RPM_HASH = "a7e2a6603bf6cff35938efa4a0bea00e15a4363e572f0f91a2acdbe773cb01bb25ec68c9bb2ab5bb264e6b86c9e8cb17c3db2020ca998a447fb926fe46b1a09b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-case \
python310-case \
python3dist-case"

RDEPENDS:${PN} += "python-abi \
python310-pytest \
python310-setuptools \
python310-six"

inherit rpm
