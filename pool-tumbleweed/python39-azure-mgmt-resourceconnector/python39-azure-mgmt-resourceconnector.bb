SUMMARY = "Microsoft Azure Resourceconnector Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Resourceconnector Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python39-azure-mgmt-resourceconnector-1.0.0.0-1.1.noarch.rpm"
RPM_HASH = "f55e69483a32fb20f88dd22d92afac2f612d34d6ad963ec70c780cadbb2e0fa9ea92dac4331783504096d3fb0e03098d9cc1dc5801bff53d7a4de3aeb218746a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-resourceconnector \
python39-azure-mgmt-resourceconnector \
python3dist-azure-mgmt-resourceconnector"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
