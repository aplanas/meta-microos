SUMMARY = "Simplified requests calls mocking for pytest"
DESCRIPTION = "Simplified requests calls mocking for pytest."
LICENSE = "BSD-3-Clause"

PV = "1.1.1"

RPM_NAME = "python310-pytest-responsemock-1.1.1-1.7.noarch.rpm"
RPM_HASH = "6e7072e544ad2cbc73be0b7056857c4f1c66fcc78adaaac4e4c0200cd9d62e0e2db9de770c0f0c8d9878aaa5eb60109c2fc509b2899b0fe8f59c8927038325a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-responsemock \
python310-pytest-responsemock \
python3dist-pytest-responsemock"

RDEPENDS:${PN} += "python-abi \
python310-pytest \
python310-responses"

inherit rpm
