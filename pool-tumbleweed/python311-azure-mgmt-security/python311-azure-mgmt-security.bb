SUMMARY = "Microsoft Azure Security Center Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Security Center Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "5.0.0"

RPM_NAME = "python311-azure-mgmt-security-5.0.0-1.2.noarch.rpm"
RPM_HASH = "95c9f41f6a1676879169f4c18390288e63023e477aadef41d6627cd2e25228831d424d3c900d5a8b1c6d4ddecd0074ab67fda5c6dd3bf9647ecc0d766ab054cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-security \
python3.11dist-azure-mgmt-security \
python311-azure-mgmt-security \
python3dist-azure-mgmt-security"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
