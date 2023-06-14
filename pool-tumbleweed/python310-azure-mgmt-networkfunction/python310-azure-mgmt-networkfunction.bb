SUMMARY = "Microsoft Azure Networkfunction Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Networkfunction Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python310-azure-mgmt-networkfunction-1.0.0~b1-1.3.noarch.rpm"
RPM_HASH = "799073c3efcc6e782ef9a0c0c988474aa2c9fcb00a2a8051a475116a76811f2075b6e8fe6d0ecfd8366279a7b9b0c10b391d281af76edc4faaf22a4089061e65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-networkfunction \
python3.10dist-azure-mgmt-networkfunction \
python310-azure-mgmt-networkfunction \
python3dist-azure-mgmt-networkfunction"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
