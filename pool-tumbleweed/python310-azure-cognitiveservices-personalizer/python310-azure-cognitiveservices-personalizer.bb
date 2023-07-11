SUMMARY = "Microsoft Azure Personalizer Client Library"
DESCRIPTION = "This is the Microsoft Azure Personalizer Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "python310-azure-cognitiveservices-personalizer-0.1.0-2.12.noarch.rpm"
RPM_HASH = "26683af87d703bb2b07ddc9a85c56bdd9d3d439fe9970f07f1c198df5f4494280dc8f3a77d4df2493c9817083b59e5ffdc13c58930eb9d747dde6fcbad09b9dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-cognitiveservices-personalizer \
python310-azure-cognitiveservices-personalizer \
python3dist-azure-cognitiveservices-personalizer"

RDEPENDS:${PN} += "python-abi \
python310-azure-cognitiveservices-nspkg \
python310-azure-common \
python310-azure-nspkg \
python310-msrest"

inherit rpm
