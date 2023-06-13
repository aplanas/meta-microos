SUMMARY = "Microsoft Azure Cognitive Services Anomaly Detector Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Anomaly Detector Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python39-azure-cognitiveservices-anomalydetector-0.3.0-2.11.noarch.rpm"
RPM_HASH = "a548e85c0f5f04dc5cb21329d02b01fa765124db68cddd1c5881f36ab277a99466e3b4ca733f88909108de3657ca86463b93f8ed5ba68e43a0989f5e369bc0ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-cognitiveservices-anomalydetector) \
python39-azure-cognitiveservices-anomalydetector \
python3dist(azure-cognitiveservices-anomalydetector)"

RDEPENDS:${PN} += "python(abi) \
python39-azure-cognitiveservices-nspkg \
python39-azure-common \
python39-azure-nspkg \
python39-msrest"

inherit rpm
