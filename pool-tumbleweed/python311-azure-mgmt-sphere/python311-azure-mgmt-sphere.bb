SUMMARY = "Microsoft Azure Sphere Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Sphere Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python311-azure-mgmt-sphere-1.0.0~b1-1.1.noarch.rpm"
RPM_HASH = "7cd4c54213f316683aff86edcdb19365a0385db69f138f54036fe02597e31f4c50d7c5420ce353bf78f28edd929a8372d039db1ff9dda6438e260c064ca3578c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-sphere \
python3.11dist-azure-mgmt-sphere \
python311-azure-mgmt-sphere \
python3dist-azure-mgmt-sphere"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
