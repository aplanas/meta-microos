SUMMARY = "Microsoft Azure Agrifood Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Agrifood Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b3"

RPM_NAME = "python310-azure-mgmt-agrifood-1.0.0b3-1.3.noarch.rpm"
RPM_HASH = "7ef24dcff0fdf96940c7fc54b0eac7dcad061177f7c1625646d18feb576ddf96068588c31637d89843314cd99d8f5cf353588d5856da9ab5dc6723b08bea72b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-agrifood \
python3.10dist(azure-mgmt-agrifood) \
python310-azure-mgmt-agrifood \
python3dist(azure-mgmt-agrifood)"
RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) \
python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
