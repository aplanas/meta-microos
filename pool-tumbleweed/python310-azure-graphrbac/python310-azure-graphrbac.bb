SUMMARY = "Microsoft Azure Graph RBAC Client Library"
DESCRIPTION = "This is the Microsoft Azure Graph RBAC Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.61.1"

RPM_NAME = "python310-azure-graphrbac-0.61.1-2.11.noarch.rpm"
RPM_HASH = "26cc4319f1a2e15f036a917186cf8e7acb7b0ae11a03e0479e3bbc6b9620d32eb19b221a7f39636652c88fb7bfd6762e0d99f878702b6bb67282c1b8e516eaf9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-graphrbac \
python3.10dist(azure-graphrbac) \
python310-azure-graphrbac \
python3dist(azure-graphrbac)"

RDEPENDS:${PN} += "python(abi) \
python310-azure-common \
python310-azure-nspkg \
python310-msrest \
python310-msrestazure"

inherit rpm
