SUMMARY = "Microsoft Azure Selfhelp Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Selfhelp Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-mgmt-selfhelp-1.0.0-1.1.noarch.rpm"
RPM_HASH = "f0f073382b9cdaf8675bf86702c646d0d28b1ac66092e65bd33a92cb4a31d536bc2c75819bc7e5028e22a7eba491d2265c31b0c5d7f36d5a5012ff1008fb94aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-selfhelp \
python3.11dist-azure-mgmt-selfhelp \
python311-azure-mgmt-selfhelp \
python3dist-azure-mgmt-selfhelp"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
