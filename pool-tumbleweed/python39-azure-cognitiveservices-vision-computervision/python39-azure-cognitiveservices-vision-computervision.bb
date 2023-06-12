SUMMARY = "Microsoft Azure Cognitive Services Computer Vision Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Computer Vision Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python39-azure-cognitiveservices-vision-computervision-0.9.0-1.8.noarch.rpm"
RPM_HASH = "f86ea32ff619a92296779471fa46645b8210c5c6eb525d820e6ba667fc369881555a21e584b27a359c27da389c8d63b04e72cd273a9a9e0eeebcfdc7849f2faa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-cognitiveservices-vision-computervision) \
python39-azure-cognitiveservices-vision-computervision \
python3dist(azure-cognitiveservices-vision-computervision)"
RDEPENDS:${PN} += "python(abi) \
python39-azure-cognitiveservices-nspkg \
python39-azure-cognitiveservices-vision-nspkg \
python39-azure-common \
python39-azure-nspkg \
python39-msrest"

inherit rpm
