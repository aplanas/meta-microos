SUMMARY = "A pure Python Levenshtein implementation"
DESCRIPTION = "A pure Python Levenshtein implementation."
LICENSE = "BSD-3-Clause"

PV = "1.4.0"

RPM_NAME = "python310-pylev-1.4.0-2.2.noarch.rpm"
RPM_HASH = "b1fab890488e907592e5ce76a93586f82c8149d60f95a1e9f746e1c424760c0921248790f915c068a35f4755865a4df476d9316e7ec2c7a9e847355e1a5eb104"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pylev \
python310-pylev \
python3dist-pylev"

RDEPENDS:${PN} += "python-abi"

inherit rpm
