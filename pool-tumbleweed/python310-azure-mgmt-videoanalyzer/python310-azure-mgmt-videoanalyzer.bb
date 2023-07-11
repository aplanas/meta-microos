SUMMARY = "Microsoft Azure Video Analyzer Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Video Analyzer Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b4"

RPM_NAME = "python310-azure-mgmt-videoanalyzer-1.0.0b4-1.6.noarch.rpm"
RPM_HASH = "a2cc8f3affa95343b5ecf299ba5f97f869534f3aa1ddd7fd0b78f9685f90487075cfd2a05d2cdc3895f0c3841ea0f92dd5770164e1172f05d7f4597059547ed8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-videoanalyzer \
python310-azure-mgmt-videoanalyzer \
python3dist-azure-mgmt-videoanalyzer"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
