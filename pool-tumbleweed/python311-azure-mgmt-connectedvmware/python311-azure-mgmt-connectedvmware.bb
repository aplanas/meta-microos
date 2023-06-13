SUMMARY = "Microsoft Azure Connectedvmware Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Connectedvmware Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.0.0b3"

RPM_NAME = "python311-azure-mgmt-connectedvmware-1.0.0b3-1.3.noarch.rpm"
RPM_HASH = "fbfc582b60e0d51bfaaffe86074e76f1e306f8f1de276d765583c9c6c505ec498d969fa4c5e37cccc3dc1dde7522d0b66fa5c03d533973a5706c8a0557b1a470"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-connectedvmware) \
python311-azure-mgmt-connectedvmware \
python3dist(azure-mgmt-connectedvmware)"

RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) \
python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
