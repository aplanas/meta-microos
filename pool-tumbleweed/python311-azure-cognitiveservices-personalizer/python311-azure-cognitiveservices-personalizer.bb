SUMMARY = "Microsoft Azure Personalizer Client Library"
DESCRIPTION = "This is the Microsoft Azure Personalizer Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "python311-azure-cognitiveservices-personalizer-0.1.0-2.12.noarch.rpm"
RPM_HASH = "1123ec200a3abd2d15712a5ffef1ce9fa32c6ddac086b78a0d1d75242904644b6287ac38ba2652cb1392eb3f0db902197e06a88e9bee9b6cb85bb9b0124ed2bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-personalizer \
python3.11dist-azure-cognitiveservices-personalizer \
python311-azure-cognitiveservices-personalizer \
python3dist-azure-cognitiveservices-personalizer"

RDEPENDS:${PN} += "python-abi \
python311-azure-cognitiveservices-nspkg \
python311-azure-common \
python311-azure-nspkg \
python311-msrest"

inherit rpm
