SUMMARY = "Microsoft Azure Loadtesting Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Loadtesting Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-mgmt-loadtesting-1.0.0-1.3.noarch.rpm"
RPM_HASH = "ea716a395ba861dba0f380d06fe641ff8606629d26e8612822a48c1ba32d9b0b8202cb13663a98a81f4d0418aa4a6c6b05737b0e7890e75a86fdf67acb4b62fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-loadtesting) \
python39-azure-mgmt-loadtesting \
python3dist(azure-mgmt-loadtesting)"

RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) \
python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
