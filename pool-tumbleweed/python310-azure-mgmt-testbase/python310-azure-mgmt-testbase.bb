SUMMARY = "Microsoft Azure Testbase Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Testbase Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b2"

RPM_NAME = "python310-azure-mgmt-testbase-1.0.0b2-1.4.noarch.rpm"
RPM_HASH = "eae25357c48078ed6c0928868d3b076ad54b0ac2db2e088e94fd8376c0160f4d10b3389f5f03728bd6f75dffe0b7f34df7843ea4fde1197b4822f9bb46e065a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-testbase \
python310-azure-mgmt-testbase \
python3dist-azure-mgmt-testbase"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
