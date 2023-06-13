SUMMARY = "Microsoft Azure Stream Analytics Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Stream Analytics Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python39-azure-mgmt-streamanalytics-1.0.0.0-1.7.noarch.rpm"
RPM_HASH = "f0d6f1e95f8190583ed3dc6f33014dba18a155c7d4b3ff33342e59cec3c3f43927fc12d102e1b7a10eca168599223ee9639ec77b993621ecbcb9498658e4d2b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-streamanalytics) \
python39-azure-mgmt-streamanalytics \
python3dist(azure-mgmt-streamanalytics)"

RDEPENDS:${PN} += "python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
