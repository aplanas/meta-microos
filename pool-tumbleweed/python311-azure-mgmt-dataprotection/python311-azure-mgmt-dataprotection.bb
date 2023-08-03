SUMMARY = "Microsoft Azure Dataprotection Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Dataprotection Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python311-azure-mgmt-dataprotection-1.2.0-1.1.noarch.rpm"
RPM_HASH = "3269965261578a4ba268716cbe935db969a7318a843abe806ee462679f94c083b406cb1297000b7c187c46ccc1eb40d1624ffb90f886c072cac034dbd7f97a3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-dataprotection \
python3.11dist-azure-mgmt-dataprotection \
python311-azure-mgmt-dataprotection \
python3dist-azure-mgmt-dataprotection"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
