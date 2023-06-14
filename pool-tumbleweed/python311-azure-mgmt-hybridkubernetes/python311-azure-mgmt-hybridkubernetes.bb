SUMMARY = "Microsoft Azure HybridKubernetes Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure HybridKubernetes Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8"
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python311-azure-mgmt-hybridkubernetes-1.1.0-1.8.noarch.rpm"
RPM_HASH = "cb9540c34ad02431e53946fe13bae97f0a13e3ad7b4b9fe1b2ff1477f47d2ed460458c68588ad1bfbe1ca5db6dcd972a6efba465c8ff1eca3e32630a0c647634"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-mgmt-hybridkubernetes \
python311-azure-mgmt-hybridkubernetes \
python3dist-azure-mgmt-hybridkubernetes"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
