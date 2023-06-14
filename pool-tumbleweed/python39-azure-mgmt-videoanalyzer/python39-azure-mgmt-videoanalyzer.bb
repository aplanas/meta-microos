SUMMARY = "Microsoft Azure Video Analyzer Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Video Analyzer Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b4"

RPM_NAME = "python39-azure-mgmt-videoanalyzer-1.0.0b4-1.5.noarch.rpm"
RPM_HASH = "0c7083b66f9c5457d68b4b14c0102998f5525b4d217e5e8ea21e98271df166045203e6551beea541a0f197bac72d14c69410e77283b9d8e128f7a0f1f74d4e62"
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
