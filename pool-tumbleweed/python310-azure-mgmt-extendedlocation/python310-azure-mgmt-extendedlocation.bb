SUMMARY = "Microsoft Azure Extendedlocation Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Extendedlocation Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python310-azure-mgmt-extendedlocation-1.1.0-1.5.noarch.rpm"
RPM_HASH = "ca3e0988198340be7ecaf3e9690e982385c0956963fa592a7e6e2c8ba674964ab74439f008170d645150b9afebd1630d690d4c4939a5d4d606b7104a7cfe6743"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-extendedlocation \
python310-azure-mgmt-extendedlocation \
python3dist-azure-mgmt-extendedlocation"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
