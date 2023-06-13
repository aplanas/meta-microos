SUMMARY = "Microsoft Azure Quota Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Quota Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.1.0~b3"

RPM_NAME = "python310-azure-mgmt-quota-1.1.0~b3-1.3.noarch.rpm"
RPM_HASH = "a49ba5566f5cb4c51819c69980495bde1dd174b57d94f6e39f02a5bf4e91311f1b11f2ee533c15295a7121507ca6aba16eada42b1fd6fb00e5f3d5c992131b62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-quota \
python3.10dist(azure-mgmt-quota) \
python310-azure-mgmt-quota \
python3dist(azure-mgmt-quota)"

RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) \
python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
