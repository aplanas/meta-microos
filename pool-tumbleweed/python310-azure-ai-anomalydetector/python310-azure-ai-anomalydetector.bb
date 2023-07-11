SUMMARY = "Microsoft Azure Cognitive Services Anomaly Detector Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Anomaly Detector Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "3.0.0b6"

RPM_NAME = "python310-azure-ai-anomalydetector-3.0.0b6-1.1.noarch.rpm"
RPM_HASH = "fdb2c90537e6813b1612076e58b3e82a29133e4213d49003bd70b1c923de64fe8c8a0682950f24f3d41c35bcb2984b7fc1059420bb2e302c49451267c2dafd8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-ai-anomalydetector \
python310-azure-ai-anomalydetector \
python3dist-azure-ai-anomalydetector"

RDEPENDS:${PN} += "python-abi \
python310-azure-ai-nspkg \
python310-azure-common \
python310-azure-core \
python310-isodate"

inherit rpm
