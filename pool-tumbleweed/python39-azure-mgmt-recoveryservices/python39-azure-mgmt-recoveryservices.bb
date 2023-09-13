SUMMARY = "Microsoft Azure Recovery Services Client Library"
DESCRIPTION = "This is the Microsoft Azure Recovery Services Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "python39-azure-mgmt-recoveryservices-2.5.0-1.1.noarch.rpm"
RPM_HASH = "2984592f572313b14e21342e96e72cb08b40388a2fe10d9a99d5a5a6adbd54819bf2ee23614d3a70f0185a8dbcfdd817e6aa0884e61b34234da720df113df4f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-recoveryservices \
python39-azure-mgmt-recoveryservices \
python3dist-azure-mgmt-recoveryservices"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
