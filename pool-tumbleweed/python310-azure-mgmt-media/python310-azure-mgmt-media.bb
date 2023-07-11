SUMMARY = "Microsoft Azure Media Services Client Library"
DESCRIPTION = "This is the Microsoft Azure Media Services Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "10.2.0"

RPM_NAME = "python310-azure-mgmt-media-10.2.0-1.4.noarch.rpm"
RPM_HASH = "b5c49997988253f04bd537822b5f0b4d05859230bd0bbe1cf004703a5dc3f70541c96150a4fd0c4a97ddecd3e423a911f8cb1578fc6462843ea056c7b3931ab2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-media \
python310-azure-mgmt-media \
python3dist-azure-mgmt-media"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
