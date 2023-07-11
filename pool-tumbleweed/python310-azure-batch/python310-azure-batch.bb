SUMMARY = "Microsoft Azure Batch Client Library"
DESCRIPTION = "This is the Microsoft Azure Batch Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "14.0.0"

RPM_NAME = "python310-azure-batch-14.0.0-1.2.noarch.rpm"
RPM_HASH = "384b1670e8b925e11ec985a4ac3e96d916107b07931696375510911855232fcafa8fce5dfaee67b09f14b8eab0b819cd7a3d8c652e2a6d1ce8fd4a17ac0e6c73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-batch \
python310-azure-batch \
python3dist-azure-batch"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-nspkg \
python310-msrestazure"

inherit rpm
