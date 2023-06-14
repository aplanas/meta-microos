SUMMARY = "Microsoft Azure Workloads Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Workloads Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python311-azure-mgmt-workloads-1.0.0.0-1.1.noarch.rpm"
RPM_HASH = "fda0e12af235607ca3333a1fa9699bb63da44e7344a00aa086292448ec323a25a14ec738d5ef94f0f59cec7404e47e886b93ef0b3e4d12592acaffcfb0ab550d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-mgmt-workloads \
python311-azure-mgmt-workloads \
python3dist-azure-mgmt-workloads"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
