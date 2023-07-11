SUMMARY = "Microsoft Azure Stream Analytics Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Stream Analytics Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python310-azure-mgmt-streamanalytics-1.0.0.0-1.8.noarch.rpm"
RPM_HASH = "c590fac307d8e37953673b35e50bfa58ebc39372fc8dd240504990b50edff759aac5fe166fd496109555546d83a1fc1354e7f1746ec8ff9dbc439ad05ccb07a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-streamanalytics \
python310-azure-mgmt-streamanalytics \
python3dist-azure-mgmt-streamanalytics"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
