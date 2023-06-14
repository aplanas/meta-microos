SUMMARY = "Microsoft Azure Servicelinker Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Servicelinker Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.2.0~b1"

RPM_NAME = "python310-azure-mgmt-servicelinker-1.2.0~b1-1.3.noarch.rpm"
RPM_HASH = "6e0dcf91a1f4a619b904dccbccdb560a3cc98c80a0067a933c1ad422b854ecaf00239a4534642f0c1bfe3b4f4d3dd9abcf0f5f023cac3e0bc5a437c721afe08d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-servicelinker \
python3.10dist-azure-mgmt-servicelinker \
python310-azure-mgmt-servicelinker \
python3dist-azure-mgmt-servicelinker"

RDEPENDS:${PN} += "-python310-typing-extensions >= 4.3.0 if python310-base < 3.8 \
python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
