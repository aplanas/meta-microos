SUMMARY = "Constants used in Chinese text processing"
DESCRIPTION = "Zhon provides constants used in Chinese text processing."
LICENSE = "MIT"

PV = "1.1.5"

RPM_NAME = "python310-zhon-1.1.5-4.3.noarch.rpm"
RPM_HASH = "9f610c408d5811cb7dafa6c91843662ea458d2bfcbe4f314d7874250d3417e90ffaf451ff4337d4ffec4bee59557fc18d0cd209c80b8530185db45c88c5ac68b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-zhon \
python310-zhon \
python3dist-zhon"

RDEPENDS:${PN} += "python-abi"

inherit rpm
