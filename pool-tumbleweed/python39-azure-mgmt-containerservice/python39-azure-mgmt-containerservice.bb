SUMMARY = "Microsoft Azure Container Service Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Container Service Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "26.0.0"

RPM_NAME = "python39-azure-mgmt-containerservice-26.0.0-1.1.noarch.rpm"
RPM_HASH = "f68730f1c1de42782769d85e4f7db7c3aa9f3557a7d51c8cbdef4c1613cd6aab7a8cf883a1b9dfda2300b9513abef8762cef8d2e10b17457a39364a060f5a184"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-containerservice \
python39-azure-mgmt-containerservice \
python3dist-azure-mgmt-containerservice"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
