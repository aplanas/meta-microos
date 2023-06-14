SUMMARY = "Microsoft Azure Personalizer Client Library"
DESCRIPTION = "This is the Microsoft Azure Personalizer Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "python39-azure-cognitiveservices-personalizer-0.1.0-2.11.noarch.rpm"
RPM_HASH = "de42c97ac271f09fd202bb1c782f3f46f5b949397c77387351d2eb987cdd2acd7ac2a92efe08c3b0fbf0c7a44cf340022307639cea4e72dceefe93793d72e8c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-cognitiveservices-personalizer \
python39-azure-cognitiveservices-personalizer \
python3dist-azure-cognitiveservices-personalizer"

RDEPENDS:${PN} += "python-abi \
python39-azure-cognitiveservices-nspkg \
python39-azure-common \
python39-azure-nspkg \
python39-msrest"

inherit rpm
