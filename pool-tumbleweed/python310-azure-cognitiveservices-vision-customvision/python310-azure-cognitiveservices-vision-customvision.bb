SUMMARY = "Microsoft Azure Custom Vision Client Library"
DESCRIPTION = "This is the Microsoft Azure Custom Vision Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python310-azure-cognitiveservices-vision-customvision-3.1.0-2.12.noarch.rpm"
RPM_HASH = "2b4da75f657f7af1d3540ee15c8feff63196b0c60e08b946991103a1a27c9a1c08cbd77454498eb4dd600e382c3e600056e14cce17c19cfb38b43279fc1a8cb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-cognitiveservices-vision-customvision \
python310-azure-cognitiveservices-vision-customvision \
python3dist-azure-cognitiveservices-vision-customvision"

RDEPENDS:${PN} += "python-abi \
python310-azure-cognitiveservices-nspkg \
python310-azure-cognitiveservices-vision-nspkg \
python310-azure-common \
python310-azure-nspkg \
python310-msrest"

inherit rpm
