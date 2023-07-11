SUMMARY = "Small personal collection of python utility functions"
DESCRIPTION = "Small personal collection of python utility functions"
LICENSE = "MIT"

PV = "0.2.2"

RPM_NAME = "python310-littleutils-0.2.2-2.2.noarch.rpm"
RPM_HASH = "85e787d41c4bc5deaec1c2cf8c6c252aa4d1ff8c57f21f0caaaca75d4dbf8723a8e56ddf824a0149b07332968d7527a3ecbc9f545738d5e8714276248ae8532d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-littleutils \
python310-littleutils \
python3dist-littleutils"

RDEPENDS:${PN} += "python-abi"

inherit rpm
