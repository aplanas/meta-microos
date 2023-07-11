SUMMARY = "Microsoft Azure Chaos Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Chaos Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.0.0b6"

RPM_NAME = "python310-azure-mgmt-chaos-1.0.0b6-1.4.noarch.rpm"
RPM_HASH = "952d2768f2584b67f3a699228e7580c367e204aba560b37fbfe4c8ed86ed5636b5a205450f6b151bc4abf3643e4e6bd978a0c192f7a561326901de94b0f88329"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-chaos \
python310-azure-mgmt-chaos \
python3dist-azure-mgmt-chaos"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
