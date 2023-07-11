SUMMARY = "Microsoft Azure Quota Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Quota Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.1.0~b3"

RPM_NAME = "python310-azure-mgmt-quota-1.1.0~b3-1.4.noarch.rpm"
RPM_HASH = "355c69dacee3583aa0c66d37da4d136e85e3021cfaff812bc33a0e85839855bb37a392ac70094ab5b7462db04bc610dc35ec908e6ebf1e5c141f52dd67f330bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-quota \
python310-azure-mgmt-quota \
python3dist-azure-mgmt-quota"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
