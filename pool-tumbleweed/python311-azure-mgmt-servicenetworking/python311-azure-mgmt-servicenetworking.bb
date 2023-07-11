SUMMARY = "Microsoft Azure Servicenetworking Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Servicenetworking Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.0.0~b2"

RPM_NAME = "python311-azure-mgmt-servicenetworking-1.0.0~b2-1.2.noarch.rpm"
RPM_HASH = "c40698f853544cab22b46a503cba0e7f4e968ed81c87f213c816276d0e49d122eaea7da21c9d8bcae94939662ece7f7be8fa8b51f25e83844ffdf1608e7b21c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-servicenetworking \
python3.11dist-azure-mgmt-servicenetworking \
python311-azure-mgmt-servicenetworking \
python3dist-azure-mgmt-servicenetworking"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
