SUMMARY = "Microsoft Azure Relay Client Library"
DESCRIPTION = "This is the Microsoft Azure Relay Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python311-azure-mgmt-relay-1.1.0-1.9.noarch.rpm"
RPM_HASH = "b3ac8231da842ca9fc295e6c15962de4a07e37d8acfc2d99def22e595f0d9551c8fad501da09f8d338a50c0c82feba74119ae851b1c2e30dd4a431cbabbe3d0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-relay \
python3.11dist-azure-mgmt-relay \
python311-azure-mgmt-relay \
python3dist-azure-mgmt-relay"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
