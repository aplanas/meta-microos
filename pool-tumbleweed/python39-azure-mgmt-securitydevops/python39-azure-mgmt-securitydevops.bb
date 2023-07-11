SUMMARY = "Microsoft Azure Securitydevops Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Securitydevops Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0~b2"

RPM_NAME = "python39-azure-mgmt-securitydevops-1.0.0~b2-1.4.noarch.rpm"
RPM_HASH = "858c14a07d7fc0b89c2b2baf0d33af2637f41cb05993c3ccab3790b05a613613e870e14e3dcbd0309b65dfae1750dd48879d2efb0ce7dd25e0a3409f78e70f8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-securitydevops \
python39-azure-mgmt-securitydevops \
python3dist-azure-mgmt-securitydevops"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
