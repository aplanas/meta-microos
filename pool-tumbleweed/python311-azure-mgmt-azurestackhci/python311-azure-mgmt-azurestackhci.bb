SUMMARY = "Microsoft Azure MyService Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "7.0.0"

RPM_NAME = "python311-azure-mgmt-azurestackhci-7.0.0-1.6.noarch.rpm"
RPM_HASH = "4d7096a8584f2d07b010b7e4c425b58821e6210ff14de72c78d91e36a9da066cab8ff5f9dc0ee809bedd4634976e03ebd80091fd52737afd01d3a00e0e7e8709"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-azurestackhci \
python3.11dist-azure-mgmt-azurestackhci \
python311-azure-mgmt-azurestackhci \
python3dist-azure-mgmt-azurestackhci"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
