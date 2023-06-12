SUMMARY = "Microsoft Azure Voiceservices Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Voiceservices Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-mgmt-voiceservices-1.0.0-1.1.noarch.rpm"
RPM_HASH = "4ea673e63ec43267f9b72c288fc484cef4a7986c202da487faa7bd85b37098d9d4d9ebd9ee0e6a6870df866e281b13aea8d338da0dd66430cad25c090cdb3b40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-voiceservices) \
python39-azure-mgmt-voiceservices \
python3dist(azure-mgmt-voiceservices)"
RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) \
python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
