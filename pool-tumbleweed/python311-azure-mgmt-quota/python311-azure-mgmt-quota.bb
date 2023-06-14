SUMMARY = "Microsoft Azure Quota Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Quota Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.1.0~b3"

RPM_NAME = "python311-azure-mgmt-quota-1.1.0~b3-1.3.noarch.rpm"
RPM_HASH = "c3c84ebc6cc53d2b761c54ec756da773ac7c81f1687e1084d7f4daba597d0dbd1e1791ef12d987b5bae24b6eca542fe0a7388d16db56b91a80db1b1f7a2a67b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-mgmt-quota \
python311-azure-mgmt-quota \
python3dist-azure-mgmt-quota"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
