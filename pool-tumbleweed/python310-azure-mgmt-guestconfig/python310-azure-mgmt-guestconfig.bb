SUMMARY = "Microsoft Azure Guestconfig Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Guestconfig Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b2"

RPM_NAME = "python310-azure-mgmt-guestconfig-1.0.0b2-1.4.noarch.rpm"
RPM_HASH = "77bf5de8009cd280e2ff3c0b036ec27ba10ddada73c5e4f3eaba035fc7b7b566f2254896659693c0e74e9205cea8e3edb7592d5b90502ca88222b9315bc37d74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-guestconfig \
python310-azure-mgmt-guestconfig \
python3dist-azure-mgmt-guestconfig"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
