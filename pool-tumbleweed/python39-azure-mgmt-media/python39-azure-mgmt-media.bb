SUMMARY = "Microsoft Azure Media Services Client Library"
DESCRIPTION = "This is the Microsoft Azure Media Services Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "10.2.0"

RPM_NAME = "python39-azure-mgmt-media-10.2.0-1.3.noarch.rpm"
RPM_HASH = "532bcdfeee0093bf8a3e222df4c337fb46bcf79848b561fc0cd5ef11a2df1c791bbeeebb1cd36538c41c1011885630275e3f20316b6f2656cea59c6c51d14cec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-media \
python39-azure-mgmt-media \
python3dist-azure-mgmt-media"

RDEPENDS:${PN} += "-python39-typing-extensions >= 4.3.0 if python39-base < 3.8 \
python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
