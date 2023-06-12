SUMMARY = "Microsoft Azure Scvmm Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Scvmm Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0b2"

RPM_NAME = "python311-azure-mgmt-scvmm-1.0.0b2-1.3.noarch.rpm"
RPM_HASH = "5cf6543b571fe2ecd2b369a70c514c0b00dfa838de3e98f39d65ecba85ed44184bebfe8c9ae37367aaabf6d26d80578147453b5a2d24de6d8f8f62f2247c3197"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-scvmm) \
python311-azure-mgmt-scvmm \
python3dist(azure-mgmt-scvmm)"
RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) \
python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
