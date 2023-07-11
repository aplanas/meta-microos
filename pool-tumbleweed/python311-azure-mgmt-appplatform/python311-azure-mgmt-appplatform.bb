SUMMARY = "Microsoft Azure MyService Management Client Library"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "8.0.0"

RPM_NAME = "python311-azure-mgmt-appplatform-8.0.0-1.2.noarch.rpm"
RPM_HASH = "cec95b4d909b2ac50de0d3285136ddb8086728d4088e7ad86c1cc3e69b896d88e866bbee0c0efba23d27af2589fb4d682879ae3e722f657525bea17107de9482"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-appplatform \
python3.11dist-azure-mgmt-appplatform \
python311-azure-mgmt-appplatform \
python3dist-azure-mgmt-appplatform"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
