SUMMARY = "Microsoft Azure Qumulo Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Qumulo Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-mgmt-qumulo-1.0.0-1.2.noarch.rpm"
RPM_HASH = "888911ea766f1592f220e8d86184c59b61b683f84f65e0ea11bf14895c91b969d3fad88d3c62731a3e8a1cb114dd1757a20dc8c73f7d83263db9a0dee200ce4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-qumulo \
python3.11dist-azure-mgmt-qumulo \
python311-azure-mgmt-qumulo \
python3dist-azure-mgmt-qumulo"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
