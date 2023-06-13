SUMMARY = "Microsoft Azure Cognitive Services Form Recognizer Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Form Recognizer Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python311-azure-cognitiveservices-formrecognizer-0.1.1-2.11.noarch.rpm"
RPM_HASH = "0d38500b248970cce1032f26880344a761e5032845ffda7cfb9a3acb67ec23451b0feaaf46cbd8bcb2e57be6128dafed3eba0ae41fddc656baa8e0d3d6e6128c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-cognitiveservices-formrecognizer) \
python311-azure-cognitiveservices-formrecognizer \
python3dist(azure-cognitiveservices-formrecognizer)"

RDEPENDS:${PN} += "python(abi) \
python311-azure-cognitiveservices-nspkg \
python311-azure-common \
python311-azure-nspkg \
python311-msrest"

inherit rpm
