SUMMARY = "Microsoft Azure Dynatrace Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Dynatrace Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python310-azure-mgmt-dynatrace-2.0.0-1.1.noarch.rpm"
RPM_HASH = "b17a6426a1aeecd81601692e5eec101e0c3632d8e39457218d4ec22a0b39a7dc5d75cad81d5e90cce40503688b8e3894b36787bb411e981234513b266bb21e08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-dynatrace \
python310-azure-mgmt-dynatrace \
python3dist-azure-mgmt-dynatrace"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
