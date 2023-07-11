SUMMARY = "Microsoft Azure Compute Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Compute Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "30.0.0"

RPM_NAME = "python311-azure-mgmt-compute-30.0.0-1.2.noarch.rpm"
RPM_HASH = "008a6dca9db39a743c0c92722d84891b2c0a4863e08973b7aa1322d0cecf4166e894069918e8c62c195c0bb9bdb39d507761c5858e49d19aa33d5e0ab7c1c27d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-compute \
python3.11dist-azure-mgmt-compute \
python311-azure-mgmt-compute \
python3dist-azure-mgmt-compute"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
