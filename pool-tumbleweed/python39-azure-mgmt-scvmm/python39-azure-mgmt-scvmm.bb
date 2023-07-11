SUMMARY = "Microsoft Azure Scvmm Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Scvmm Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0b2"

RPM_NAME = "python39-azure-mgmt-scvmm-1.0.0b2-1.4.noarch.rpm"
RPM_HASH = "bf2a884a9e3d911427fb400cb430826215e977348fd19639f82918e6e4c00f001cb1e9c6c282d3edebd9e995fc0c2b4765cf685f90b42db581d6b3d88b97d854"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-scvmm \
python39-azure-mgmt-scvmm \
python3dist-azure-mgmt-scvmm"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
