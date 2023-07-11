SUMMARY = "Microsoft Azure Voiceservices Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Voiceservices Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-mgmt-voiceservices-1.0.0-1.2.noarch.rpm"
RPM_HASH = "56a1ef6fe7f303d8bbf76091b5cc7626509c20f6273fb7b96747fb79ca37f86d20d1b50276b37d55dd15d05b2dec6d87630edbf8aec3cd6fa6642677e9cd67e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-voiceservices \
python310-azure-mgmt-voiceservices \
python3dist-azure-mgmt-voiceservices"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
