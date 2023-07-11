SUMMARY = "Microsoft Azure Quota Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Quota Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.1.0~b3"

RPM_NAME = "python39-azure-mgmt-quota-1.1.0~b3-1.4.noarch.rpm"
RPM_HASH = "f67de1dc99442b11f88421652dd876adaa6497984fbb6d606de6b129b23403c670f8604820e04adda6507b2bed8a8495817f78c287dd0c8c60ea70a5990c5a95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-quota \
python39-azure-mgmt-quota \
python3dist-azure-mgmt-quota"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
