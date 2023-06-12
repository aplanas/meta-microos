SUMMARY = "Microsoft Azure Purview Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Purview Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-mgmt-purview-1.0.0-1.8.noarch.rpm"
RPM_HASH = "8d6e8ae9bddd455d22d0791b1feacb328f166de71a53babf07add2953726617f87788832e5c566711f08aebb05d4ae1e5dc65335d92763bf2a8cf10aea6c0988"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-purview) \
python39-azure-mgmt-purview \
python3dist(azure-mgmt-purview)"
RDEPENDS:${PN} += "python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
