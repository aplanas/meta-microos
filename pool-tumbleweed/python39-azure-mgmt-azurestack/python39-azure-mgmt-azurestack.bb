SUMMARY = "Microsoft Azure AzureStack Management Client Library"
DESCRIPTION = "This is the Microsoft Azure AzureStack Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-mgmt-azurestack-1.0.0-1.8.noarch.rpm"
RPM_HASH = "024dd8c8567d50150ae667ec169f13714986b532d1d8c57cc3d8470602d5ea1333cef70b048adb94f592cd08df8e7678bce28065612c228864e8b36fdb808390"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-azurestack) \
python39-azure-mgmt-azurestack \
python3dist(azure-mgmt-azurestack)"

RDEPENDS:${PN} += "python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
