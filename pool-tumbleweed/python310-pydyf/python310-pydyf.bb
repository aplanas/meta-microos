SUMMARY = "A low-level PDF generator"
DESCRIPTION = "A low-level PDF generator written in Python and based on PDF specification 1.7."
LICENSE = "BSD-3-Clause"

PV = "0.7.0"

RPM_NAME = "python310-pydyf-0.7.0-1.1.noarch.rpm"
RPM_HASH = "994ff7c29fb2805babe2c9594e0ba9e9c849ac4efa0532460899fae54a6ff8fcdb64a0772b2db27b949b7703006bcc5b784bff70a69a3efaa34377cda0ae9b34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pydyf \
python310-pydyf \
python3dist-pydyf"

RDEPENDS:${PN} += "python-abi"

inherit rpm
