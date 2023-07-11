SUMMARY = "Microsoft Azure Personalizer Client Library"
DESCRIPTION = "This is the Microsoft Azure Personalizer Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "python39-azure-cognitiveservices-personalizer-0.1.0-2.12.noarch.rpm"
RPM_HASH = "1cce532a2f76d66c27d171849e972e917345389a12d4e79c875e7a35c871480de2105d3f843757d7929d9119e7fa2186e03ffc15baacb085d831acaec9f41a53"
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
