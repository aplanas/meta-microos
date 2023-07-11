SUMMARY = "Microsoft Azure Resource Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Resource Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "23.1.0~b2"

RPM_NAME = "python310-azure-mgmt-resource-23.1.0~b2-1.1.noarch.rpm"
RPM_HASH = "a95a45acc5cf197cb944aeaddb416327edae11987c2f224d1bd034c50d9c8552aad44bfc3aa4a0c0f46a9eac5bf5ec8f18d7732b71f44dae8b506ca2d3669109"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-resource \
python310-azure-mgmt-resource \
python3dist-azure-mgmt-resource"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
