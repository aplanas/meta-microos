SUMMARY = "Support multiple formats with ease"
DESCRIPTION = "Formats will provide you with a consistent API to parse and compose data."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python310-formats-0.1.1-1.14.noarch.rpm"
RPM_HASH = "154a5b1ffe2c58f12deb98c19f418a7890bbf2492606d109104c44f66c4a1aa0a8a0b6d778637d4282f68030df8e45d85e835bf38331fb99ae31bf299c274602"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-formats \
python3.10dist-formats \
python310-formats \
python3dist-formats"

RDEPENDS:${PN} += "python-abi"

inherit rpm
