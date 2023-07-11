SUMMARY = "Microsoft Azure common code"
DESCRIPTION = "This is the Microsoft Azure common code. \
 \
This package provides shared code by the Azure packages."
LICENSE = "MIT"

PV = "1.1.28"

RPM_NAME = "python310-azure-common-1.1.28-1.7.noarch.rpm"
RPM_HASH = "27ee2423d3102af2f22452ae69d52e3b70763abbe03f7996b1a86052dd602813f87e40336205072bf52b6128f1acf7541e86aef531860cb41d08775ba62de029"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-common \
python310-azure-common \
python3dist-azure-common"

RDEPENDS:${PN} += "python-abi \
python310-azure-nspkg"

inherit rpm
