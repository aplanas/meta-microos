SUMMARY = "Microsoft Azure Quota Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Quota Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.1.0~b3"

RPM_NAME = "python311-azure-mgmt-quota-1.1.0~b3-1.4.noarch.rpm"
RPM_HASH = "ac8d07948eec9aa4f1f4f3f77e8f3799c4a4ddc21df669b1b6d9c0fe612a75bb9b936e2a7b1f0f8b7a2f3a7f651357bdb5f2249543b318a79a8fe0cd1ed7c557"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-quota \
python3.11dist-azure-mgmt-quota \
python311-azure-mgmt-quota \
python3dist-azure-mgmt-quota"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
