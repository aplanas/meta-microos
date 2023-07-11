SUMMARY = "Microsoft Azure Media Services Client Library"
DESCRIPTION = "This is the Microsoft Azure Media Services Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "10.2.0"

RPM_NAME = "python39-azure-mgmt-media-10.2.0-1.4.noarch.rpm"
RPM_HASH = "72983ce92e44161a2d05502e400e40251f41b06b7cacd40b212dffe52d0501cad9e93cfb80ac706c3040ef8326c7c14da8332c052e16e2fb3f5349e6a0cbff85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-media \
python39-azure-mgmt-media \
python3dist-azure-mgmt-media"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
