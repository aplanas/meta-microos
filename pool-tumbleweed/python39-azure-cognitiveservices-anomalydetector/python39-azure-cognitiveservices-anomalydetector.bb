SUMMARY = "Microsoft Azure Cognitive Services Anomaly Detector Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Anomaly Detector Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python39-azure-cognitiveservices-anomalydetector-0.3.0-2.12.noarch.rpm"
RPM_HASH = "78a96f9dc17cd3fc784d4d2f3001640df162c570df98b1225e6f6d467da3f997b9321f9eddf550212bcb65c5a371160e99ca371c27dfdd70752d5452c8f5d918"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-cognitiveservices-anomalydetector \
python39-azure-cognitiveservices-anomalydetector \
python3dist-azure-cognitiveservices-anomalydetector"

RDEPENDS:${PN} += "python-abi \
python39-azure-cognitiveservices-nspkg \
python39-azure-common \
python39-azure-nspkg \
python39-msrest"

inherit rpm
