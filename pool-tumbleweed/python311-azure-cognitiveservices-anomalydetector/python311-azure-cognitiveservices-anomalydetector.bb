SUMMARY = "Microsoft Azure Cognitive Services Anomaly Detector Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Anomaly Detector Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python311-azure-cognitiveservices-anomalydetector-0.3.0-2.12.noarch.rpm"
RPM_HASH = "969891763e1a03630e422c9f4a4cf5b3c9964d88d549222160407ab9c52c52110bfa83e2e5af289fcff24a8d1ada38e42f7f925bac5c3e709bfa691a086acdb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-anomalydetector \
python3.11dist-azure-cognitiveservices-anomalydetector \
python311-azure-cognitiveservices-anomalydetector \
python3dist-azure-cognitiveservices-anomalydetector"

RDEPENDS:${PN} += "python-abi \
python311-azure-cognitiveservices-nspkg \
python311-azure-common \
python311-azure-nspkg \
python311-msrest"

inherit rpm
