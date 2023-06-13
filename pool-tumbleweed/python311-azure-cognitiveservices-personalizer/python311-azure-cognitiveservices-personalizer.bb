SUMMARY = "Microsoft Azure Personalizer Client Library"
DESCRIPTION = "This is the Microsoft Azure Personalizer Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "python311-azure-cognitiveservices-personalizer-0.1.0-2.11.noarch.rpm"
RPM_HASH = "9e2ffeb7cd3c220a819a8dd53dc39e06570d031df9198d622d4d1666c30fd412929ef796bfa4e84e2a1e05d468acc4bab707c11f2eaea7427c373d61d3b48cef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-cognitiveservices-personalizer) \
python311-azure-cognitiveservices-personalizer \
python3dist(azure-cognitiveservices-personalizer)"

RDEPENDS:${PN} += "python(abi) \
python311-azure-cognitiveservices-nspkg \
python311-azure-common \
python311-azure-nspkg \
python311-msrest"

inherit rpm
