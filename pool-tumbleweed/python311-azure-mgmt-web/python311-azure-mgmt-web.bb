SUMMARY = "Microsoft Azure Web Apps Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Web Apps Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "7.1.0"

RPM_NAME = "python311-azure-mgmt-web-7.1.0-1.1.noarch.rpm"
RPM_HASH = "e280631aa3d75b969671419d6c09190f4da12689cc54fae8ead3f318498874677331cf2ff6c78fe353de55c5af822eac477f1d81e187cc52938e846ba925f1ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-mgmt-web \
python311-azure-mgmt-web \
python3dist-azure-mgmt-web"

RDEPENDS:${PN} += "-python311-typing-extensions >= 4.3.0 if python311-base < 3.8 \
python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
