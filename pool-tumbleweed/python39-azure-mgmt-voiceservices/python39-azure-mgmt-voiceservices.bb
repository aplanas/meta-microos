SUMMARY = "Microsoft Azure Voiceservices Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Voiceservices Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-mgmt-voiceservices-1.0.0-1.2.noarch.rpm"
RPM_HASH = "b3c0e6c0c347905c0a5972996f782027f83892c714f76e98145432e891bf8d201d40bb11d74a2f760f777d927612ae888d05af1313b310aa6ff8b03a84ff946f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-voiceservices \
python39-azure-mgmt-voiceservices \
python3dist-azure-mgmt-voiceservices"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
