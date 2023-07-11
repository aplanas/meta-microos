SUMMARY = "Microsoft Azure Stream Analytics Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Stream Analytics Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python39-azure-mgmt-streamanalytics-1.0.0.0-1.8.noarch.rpm"
RPM_HASH = "774387756893ab84b894ba97595b5d06893df8f0c5aa8a5c45eb58620d0205f01a50eba9841d2c9b55427fcc50822ed3793fcf5c51b3a47473fdcc06a00eb5b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-streamanalytics \
python39-azure-mgmt-streamanalytics \
python3dist-azure-mgmt-streamanalytics"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
