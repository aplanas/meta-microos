SUMMARY = "Microsoft Azure Hybridnetwork Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Hybridnetwork Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-mgmt-hybridnetwork-1.0.0-1.8.noarch.rpm"
RPM_HASH = "ba92ce33c88bce952774fe96e15808926c615a6f8903ea88d150a2845e965fffb58aadf2accf9fdb6143e7b43a35ccab5287dafb6bc71c6834f3d209e91ec82f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-hybridnetwork \
python3.10dist(azure-mgmt-hybridnetwork) \
python310-azure-mgmt-hybridnetwork \
python3dist(azure-mgmt-hybridnetwork)"

RDEPENDS:${PN} += "python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
