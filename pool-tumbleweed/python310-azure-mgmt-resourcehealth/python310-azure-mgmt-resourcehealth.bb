SUMMARY = "Microsoft Azure ResourceHealth Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure ResourceHealth Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b4"

RPM_NAME = "python310-azure-mgmt-resourcehealth-1.0.0b4-1.2.noarch.rpm"
RPM_HASH = "dda8bb976de95d6f57a73922f74bf512c21a98bf7877118689739080730fe7b9aa6e9408ad1441f7d2180abdf47be6cc9a7a74239d982ce7024222d2fefb8be0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-resourcehealth \
python310-azure-mgmt-resourcehealth \
python3dist-azure-mgmt-resourcehealth"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
