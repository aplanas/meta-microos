SUMMARY = "Microsoft Azure Auto Manage Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Auto Manage Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python310-azure-mgmt-automanage-1.0.0.0-1.4.noarch.rpm"
RPM_HASH = "475fa1249db312958498b7e52b19a31beeb0cdf7131ffe32704173f44eaa89579a9962eca592bc0beae056ca34d645ae86a4e4546f980f89e9d52e99885b61a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-automanage \
python3.10dist(azure-mgmt-automanage) \
python310-azure-mgmt-automanage \
python3dist(azure-mgmt-automanage)"

RDEPENDS:${PN} += "python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
