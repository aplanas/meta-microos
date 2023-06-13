SUMMARY = "Microsoft Azure Custom Vision Client Library"
DESCRIPTION = "This is the Microsoft Azure Custom Vision Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python311-azure-cognitiveservices-vision-customvision-3.1.0-2.11.noarch.rpm"
RPM_HASH = "3b758f3791089bc0bfb25ad34356baa03842cbfd6ec40a63b366aeaf6b4c1e3ee83e68573dfd1304d14eaf71b1880cfaffd90e9ec707427416cbb902ebce17c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-cognitiveservices-vision-customvision) \
python311-azure-cognitiveservices-vision-customvision \
python3dist(azure-cognitiveservices-vision-customvision)"

RDEPENDS:${PN} += "python(abi) \
python311-azure-cognitiveservices-nspkg \
python311-azure-cognitiveservices-vision-nspkg \
python311-azure-common \
python311-azure-nspkg \
python311-msrest"

inherit rpm
