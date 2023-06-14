SUMMARY = "Microsoft Azure Custom Vision Client Library"
DESCRIPTION = "This is the Microsoft Azure Custom Vision Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python39-azure-cognitiveservices-vision-customvision-3.1.0-2.11.noarch.rpm"
RPM_HASH = "1d1aacbe33deda024d4c59d467729ffad91aa275138b3d161250e0a35e679e008287884cf2223daf4b3f6bd5eb6f2c568da6bfdd3a0b8526d47df9ed97a590c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-cognitiveservices-vision-customvision \
python39-azure-cognitiveservices-vision-customvision \
python3dist-azure-cognitiveservices-vision-customvision"

RDEPENDS:${PN} += "python-abi \
python39-azure-cognitiveservices-nspkg \
python39-azure-cognitiveservices-vision-nspkg \
python39-azure-common \
python39-azure-nspkg \
python39-msrest"

inherit rpm
