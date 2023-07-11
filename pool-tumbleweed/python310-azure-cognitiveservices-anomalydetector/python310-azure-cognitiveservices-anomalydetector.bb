SUMMARY = "Microsoft Azure Cognitive Services Anomaly Detector Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Anomaly Detector Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python310-azure-cognitiveservices-anomalydetector-0.3.0-2.12.noarch.rpm"
RPM_HASH = "b27a8e62f8f6a734401d79f808ab8039ed3fef4f25653328ea2a932710cc85411bb4586ce910d89ad477c6e0696a7c4b6ac3ce7b70fec989c21c1d33255abb36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-cognitiveservices-anomalydetector \
python310-azure-cognitiveservices-anomalydetector \
python3dist-azure-cognitiveservices-anomalydetector"

RDEPENDS:${PN} += "python-abi \
python310-azure-cognitiveservices-nspkg \
python310-azure-common \
python310-azure-nspkg \
python310-msrest"

inherit rpm
