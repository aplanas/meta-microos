SUMMARY = "Microsoft Azure Fluidrelay Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Fluidrelay Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python39-azure-mgmt-fluidrelay-1.0.0.0-1.4.noarch.rpm"
RPM_HASH = "07fec79a38bc389d1d44397d26e3eccd15403cfcd71fc3c90fc00abafe0eebd181e6586f90cc69278c84e23d5a3ca526eee1181710afa988951db5be936900fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-fluidrelay \
python39-azure-mgmt-fluidrelay \
python3dist-azure-mgmt-fluidrelay"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
