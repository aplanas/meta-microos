SUMMARY = "Microsoft Azure DevTestLabs Management Client Library"
DESCRIPTION = "This is the Microsoft Azure DevTestLabs Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "9.0.0"

RPM_NAME = "python39-azure-mgmt-devtestlabs-9.0.0-1.10.noarch.rpm"
RPM_HASH = "08f7242ace12306b6a4e69055df15b9a8895967c97ef37bd8aaa567461f337e055da1d87bdbda4ba6ddc407b0deb5d5426344554d6b2d4ee0eb8bb00094b414e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-devtestlabs \
python39-azure-mgmt-devtestlabs \
python3dist-azure-mgmt-devtestlabs"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
