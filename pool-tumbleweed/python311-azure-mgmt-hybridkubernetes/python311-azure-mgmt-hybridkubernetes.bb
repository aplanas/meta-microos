SUMMARY = "Microsoft Azure HybridKubernetes Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure HybridKubernetes Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8"
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python311-azure-mgmt-hybridkubernetes-1.1.0-1.9.noarch.rpm"
RPM_HASH = "5dcd8d15ad3abd5fa220acb8b0143d6c8277af6b3eb6b116cdbb0db4f5119deea181088911ed5cc17ce37550e9fe70df1481526e36d1d5c58c5059ed5d64578d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-hybridkubernetes \
python3.11dist-azure-mgmt-hybridkubernetes \
python311-azure-mgmt-hybridkubernetes \
python3dist-azure-mgmt-hybridkubernetes"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
