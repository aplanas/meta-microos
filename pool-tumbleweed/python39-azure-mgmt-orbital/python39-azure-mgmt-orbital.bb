SUMMARY = "Microsoft Azure Orbital Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Orbital Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python39-azure-mgmt-orbital-2.0.0-1.3.noarch.rpm"
RPM_HASH = "fce10c8cdc2099cb8dc453477730b5158531f8327d6c8a6ab3514f06b1bbe4a55527df065e7297540bafbabcabaea9847d5fa7219f1cab2c5a77846b2084b15e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-orbital \
python39-azure-mgmt-orbital \
python3dist-azure-mgmt-orbital"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
