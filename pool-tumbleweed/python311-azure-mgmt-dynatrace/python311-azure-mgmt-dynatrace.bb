SUMMARY = "Microsoft Azure Dynatrace Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Dynatrace Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python311-azure-mgmt-dynatrace-2.0.0-1.1.noarch.rpm"
RPM_HASH = "0ed6edde6c775936a4e15e2094c30ae640ff324e97f28bf8d2bfd9fbb1c98ed33d178f09c47919eb4591292c1a8eb3da092923631fadd38079a2f939c160f30b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-dynatrace \
python3.11dist-azure-mgmt-dynatrace \
python311-azure-mgmt-dynatrace \
python3dist-azure-mgmt-dynatrace"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
