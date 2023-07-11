SUMMARY = "Microsoft Azure Communication Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Communication Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python310-azure-mgmt-communication-2.0.0-1.2.noarch.rpm"
RPM_HASH = "b9f0e93d4cb5d1786a4ce8e3d2b5256ecb37f57f8a5dedfc613f1efefb8e1c767513e21adca3c50bee750b3053ac6e904e67573f15a1733d02012b51b1d9c781"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-communication \
python310-azure-mgmt-communication \
python3dist-azure-mgmt-communication"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
