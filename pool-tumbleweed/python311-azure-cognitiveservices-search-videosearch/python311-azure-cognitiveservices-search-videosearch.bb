SUMMARY = "Microsoft Azure Cognitive Services Video Search Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Video Search Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python311-azure-cognitiveservices-search-videosearch-2.0.0-2.12.noarch.rpm"
RPM_HASH = "48eb2cf4524ff424380dc5469eff7276edd8e153d2f712f86caf62aa2c4963e9c3cd9db0a92b31386c4034773e08a9a2446825427188fcea103f6eb1255deeb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-search-videosearch \
python3.11dist-azure-cognitiveservices-search-videosearch \
python311-azure-cognitiveservices-search-videosearch \
python3dist-azure-cognitiveservices-search-videosearch"

RDEPENDS:${PN} += "python-abi \
python311-azure-cognitiveservices-nspkg \
python311-azure-cognitiveservices-search-nspkg \
python311-azure-common \
python311-azure-nspkg \
python311-msrest"

inherit rpm
