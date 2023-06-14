SUMMARY = "Microsoft Azure Security Center Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Security Center Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "5.0.0"

RPM_NAME = "python311-azure-mgmt-security-5.0.0-1.1.noarch.rpm"
RPM_HASH = "69051184d31140049df7fb0571ce4a24230d43f789d1a6f9795791b2b6c3411dc26272bc1b4b50185ad0d8cc2176bc8f70bf7bfd5fc647343bfad756a3425d3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-mgmt-security \
python311-azure-mgmt-security \
python3dist-azure-mgmt-security"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
