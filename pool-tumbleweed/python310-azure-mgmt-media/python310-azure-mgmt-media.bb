SUMMARY = "Microsoft Azure Media Services Client Library"
DESCRIPTION = "This is the Microsoft Azure Media Services Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "10.2.0"

RPM_NAME = "python310-azure-mgmt-media-10.2.0-1.3.noarch.rpm"
RPM_HASH = "ccda1c3d16bb28191e5a22f9e65d71d74b7f8cc7496a7e290e03aee50d8c30c0ed307a875e0776dbf66061def01d9eeea1b3f1e377c74ae55e679ccded8ae892"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-media \
python3.10dist(azure-mgmt-media) \
python310-azure-mgmt-media \
python3dist(azure-mgmt-media)"

RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) \
python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
