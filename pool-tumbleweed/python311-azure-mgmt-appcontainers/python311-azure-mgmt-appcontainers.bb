SUMMARY = "Microsoft Azure Appcontainers Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Appcontainers Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python311-azure-mgmt-appcontainers-3.0.0-1.1.noarch.rpm"
RPM_HASH = "b5383d184316117f6056d62ee32998fcf17af0fe6c7f72e1189938490feab15d8129f84c10330f4dc8725e5cf2caa3013fd50fcc5017f768b79f744372528af6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-appcontainers \
python3.11dist-azure-mgmt-appcontainers \
python311-azure-mgmt-appcontainers \
python3dist-azure-mgmt-appcontainers"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
