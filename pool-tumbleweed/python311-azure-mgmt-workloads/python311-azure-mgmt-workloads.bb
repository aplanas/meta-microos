SUMMARY = "Microsoft Azure Workloads Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Workloads Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python311-azure-mgmt-workloads-1.0.0.0-1.2.noarch.rpm"
RPM_HASH = "fd2b50a72a384f0371714bb407140b9a90228db0e79981029114b057300c911894cfb2401c088d990b63056052381d78792f9adb599803d354070398a9b59103"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-workloads \
python3.11dist-azure-mgmt-workloads \
python311-azure-mgmt-workloads \
python3dist-azure-mgmt-workloads"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
