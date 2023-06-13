SUMMARY = "Microsoft Azure Synapse Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Synapse Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.1.0b5"

RPM_NAME = "python39-azure-mgmt-synapse-2.1.0b5-1.3.noarch.rpm"
RPM_HASH = "ffe106e6df040978ed39197fa91564c52a3a01389b81f280a09e2820dc88d440430d123c50dba2396d4dd06394f9a83516c0f3e6310ae22df7e5158aca39d933"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-synapse) \
python39-azure-mgmt-synapse \
python3dist(azure-mgmt-synapse)"

RDEPENDS:${PN} += "python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
