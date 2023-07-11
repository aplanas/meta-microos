SUMMARY = "Microsoft Azure Cognitive Services Anomaly Detector Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Anomaly Detector Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "3.0.0b6"

RPM_NAME = "python39-azure-ai-anomalydetector-3.0.0b6-1.1.noarch.rpm"
RPM_HASH = "e600b92b5ffe6062d29533caa9fc1d71c3ce99ed4173ab068c517f466b194b3e710530ce8e4f08fe01eef869c23889547e633eff736d054a787854995b3760d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-ai-anomalydetector \
python39-azure-ai-anomalydetector \
python3dist-azure-ai-anomalydetector"

RDEPENDS:${PN} += "python-abi \
python39-azure-ai-nspkg \
python39-azure-common \
python39-azure-core \
python39-isodate"

inherit rpm
