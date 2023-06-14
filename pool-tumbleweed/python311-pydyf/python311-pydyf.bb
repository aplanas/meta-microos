SUMMARY = "A low-level PDF generator"
DESCRIPTION = "A low-level PDF generator written in Python and based on PDF specification 1.7."
LICENSE = "BSD-3-Clause"

PV = "0.6.0"

RPM_NAME = "python311-pydyf-0.6.0-1.1.noarch.rpm"
RPM_HASH = "85d28b29db6df1a5a98ccfec1665b583200d4a86015806ccbab95c3349698fe73687aec01010c0160ba0c12f688412845fdb220aea2d8ed1d7d9b35456063ea7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pydyf \
python311-pydyf \
python3dist-pydyf"

RDEPENDS:${PN} += "python-abi"

inherit rpm
