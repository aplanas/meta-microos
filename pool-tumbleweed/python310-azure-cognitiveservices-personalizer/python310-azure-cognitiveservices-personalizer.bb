SUMMARY = "Microsoft Azure Personalizer Client Library"
DESCRIPTION = "This is the Microsoft Azure Personalizer Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "python310-azure-cognitiveservices-personalizer-0.1.0-2.11.noarch.rpm"
RPM_HASH = "727e541c591bc568c1c7d810c88c66baf73383a026b9d20ab4f4506adbf48c47a5ff49e691c08c2e01a81e41adc1fab2b7769574b78a8f3c0108d70fa0d68c2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-personalizer \
python3.10dist(azure-cognitiveservices-personalizer) \
python310-azure-cognitiveservices-personalizer \
python3dist(azure-cognitiveservices-personalizer)"
RDEPENDS:${PN} += "python(abi) \
python310-azure-cognitiveservices-nspkg \
python310-azure-common \
python310-azure-nspkg \
python310-msrest"

inherit rpm
