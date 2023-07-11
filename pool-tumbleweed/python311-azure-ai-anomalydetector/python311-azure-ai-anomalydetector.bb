SUMMARY = "Microsoft Azure Cognitive Services Anomaly Detector Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Anomaly Detector Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "3.0.0b6"

RPM_NAME = "python311-azure-ai-anomalydetector-3.0.0b6-1.1.noarch.rpm"
RPM_HASH = "7b3a5487713cf9f585466489f5e3afe18f0c9c36e093693eb827284f4aafb6385c976540630a5d04e15098cdfb404cc9bbe9665a3be7f11e8703af3da81959d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-ai-anomalydetector \
python3.11dist-azure-ai-anomalydetector \
python311-azure-ai-anomalydetector \
python3dist-azure-ai-anomalydetector"

RDEPENDS:${PN} += "python-abi \
python311-azure-ai-nspkg \
python311-azure-common \
python311-azure-core \
python311-isodate"

inherit rpm
