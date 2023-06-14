SUMMARY = "Microsoft Azure Communication Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Communication Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python39-azure-mgmt-communication-2.0.0-1.1.noarch.rpm"
RPM_HASH = "624258c03e422af43a3d309c24b6e49c847a4f2ea49cdf22fc2c87c57d30f0e7c948f5302faf4a848c50ff5d5638aa21601c8c970b96e14f73fa21777391a2fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-communication \
python39-azure-mgmt-communication \
python3dist-azure-mgmt-communication"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
