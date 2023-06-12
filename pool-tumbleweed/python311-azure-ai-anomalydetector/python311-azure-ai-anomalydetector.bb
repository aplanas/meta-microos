SUMMARY = "Microsoft Azure Cognitive Services Anomaly Detector Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Anomaly Detector Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "3.0.0b5"

RPM_NAME = "python311-azure-ai-anomalydetector-3.0.0b5-1.3.noarch.rpm"
RPM_HASH = "90af6f9b06d4ffc7a90b4e65364bf6c60e288b63c0971b13deeb77f24f1f2393e0e8579d50d1eb372d84539bf6569720c20c3a791ba0b50c069ad1d96e40211d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-ai-anomalydetector) \
python311-azure-ai-anomalydetector \
python3dist(azure-ai-anomalydetector)"
RDEPENDS:${PN} += "python(abi) \
python311-azure-ai-nspkg \
python311-azure-common \
python311-azure-core \
python311-msrest"

inherit rpm
