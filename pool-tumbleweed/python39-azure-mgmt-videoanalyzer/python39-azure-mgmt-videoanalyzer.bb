SUMMARY = "Microsoft Azure Video Analyzer Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Video Analyzer Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b4"

RPM_NAME = "python39-azure-mgmt-videoanalyzer-1.0.0b4-1.6.noarch.rpm"
RPM_HASH = "fae87c7b3537435a183a3f24ddf6c113e5d33b90ae8d86d374dd32dbdff3a424a2cd3cc0cdbcee6bfe1e21bbfa07397f8a2029c0de58321a1de6c9cbc6c8ca9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-videoanalyzer \
python39-azure-mgmt-videoanalyzer \
python3dist-azure-mgmt-videoanalyzer"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
