SUMMARY = "Microsoft Azure Synapse AccessControl Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Synapse AccessControl Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python39-azure-synapse-accesscontrol-0.7.0-1.8.noarch.rpm"
RPM_HASH = "c9c086b862d712feded62dd83b94455dc5abec9b41c287b4eb2852e4649064a1db85c0bb272d95e40dd0bb737d795682ac6a27b24797892fd227f77a55caea16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-synapse-accesscontrol) \
python39-azure-synapse \
python39-azure-synapse-accesscontrol \
python3dist(azure-synapse-accesscontrol)"

RDEPENDS:${PN} += "python(abi) \
python39-azure-common \
python39-azure-core \
python39-azure-nspkg \
python39-azure-synapse-nspkg \
python39-msrest"

inherit rpm
