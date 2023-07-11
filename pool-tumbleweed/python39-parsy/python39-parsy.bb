SUMMARY = "Python parser combinators"
DESCRIPTION = "Easy-to-use parser combinators, for parsing in pure Python."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python39-parsy-1.3.0-1.9.noarch.rpm"
RPM_HASH = "b6922acf7e323fd0ef8727509b8df4c89a85c49551d9d6d3fdc69623916843af7e381f8141e0f6cb44c1d5965bd41b30fa1b57eb8e020d9c6ac9ad283eb33f02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-parsy \
python39-parsy \
python3dist-parsy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
