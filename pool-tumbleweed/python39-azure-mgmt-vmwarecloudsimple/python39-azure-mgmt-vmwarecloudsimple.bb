SUMMARY = "Microsoft Azure MyService Management Client Library"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python39-azure-mgmt-vmwarecloudsimple-0.2.0-2.12.noarch.rpm"
RPM_HASH = "d4e926f0fcb984c2e63598f7edb288cea7c693bb526bf636d15675959f25479cdcf913ac18f6cc3df7da7c76c0e41c3a5805cf2fd75f742e4983ba317d371660"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-vmwarecloudsimple \
python39-azure-mgmt-vmwarecloudsimple \
python3dist-azure-mgmt-vmwarecloudsimple"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest \
python39-msrestazure"

inherit rpm
