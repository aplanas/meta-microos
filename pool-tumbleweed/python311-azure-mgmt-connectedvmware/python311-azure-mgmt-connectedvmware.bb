SUMMARY = "Microsoft Azure Connectedvmware Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Connectedvmware Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.0.0b3"

RPM_NAME = "python311-azure-mgmt-connectedvmware-1.0.0b3-1.4.noarch.rpm"
RPM_HASH = "4ab7b4b9af11da9b754243cf6af93b35dbaf9feec835f8d8860fd20e1cfbcddfcd7784e644f56549909baa36c763c8a6cb79907140c2a35e77f80e863d814685"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-connectedvmware \
python3.11dist-azure-mgmt-connectedvmware \
python311-azure-mgmt-connectedvmware \
python3dist-azure-mgmt-connectedvmware"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
