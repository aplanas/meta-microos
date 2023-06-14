SUMMARY = "Microsoft Azure Voiceservices Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Voiceservices Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-mgmt-voiceservices-1.0.0-1.1.noarch.rpm"
RPM_HASH = "5aa6141b295924ea660039e400bd8c21516d54bfb904c288616b9f666aec6fe8690a0ca7250a6b85a66527fee6b0712587274ed57c736c9ed26b2b8652674816"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-voiceservices \
python3.10dist-azure-mgmt-voiceservices \
python310-azure-mgmt-voiceservices \
python3dist-azure-mgmt-voiceservices"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
