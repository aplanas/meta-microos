SUMMARY = "Microsoft Azure Security Center Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Security Center Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "5.0.0"

RPM_NAME = "python39-azure-mgmt-security-5.0.0-1.2.noarch.rpm"
RPM_HASH = "b701cf3d044a50de1d2bd089c18c24e57b4eb51ceab94d4ce7313fddfaed19160c90a2cc36cf7714de229f733a4f4040cb19f4f0373739b00da2a710bc3a6e2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-security \
python39-azure-mgmt-security \
python3dist-azure-mgmt-security"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
