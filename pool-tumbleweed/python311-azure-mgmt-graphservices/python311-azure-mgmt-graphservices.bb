SUMMARY = "Microsoft Azure Graphservices Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Graphservices Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-mgmt-graphservices-1.0.0-1.1.noarch.rpm"
RPM_HASH = "9b520fa83850dd4a81875107c007c172baae71f404af7e4670f072452ed1d921598667ffb7848612206deaa3b1573bbe4cb7fab53f712520b2a882f6a8544b83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-graphservices \
python3.11dist-azure-mgmt-graphservices \
python311-azure-mgmt-graphservices \
python3dist-azure-mgmt-graphservices"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
