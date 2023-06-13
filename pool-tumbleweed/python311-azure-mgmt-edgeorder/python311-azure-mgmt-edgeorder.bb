SUMMARY = "Microsoft Azure Edgeorder Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Edgeorder Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python311-azure-mgmt-edgeorder-1.0.0.0-1.6.noarch.rpm"
RPM_HASH = "d035aebc5ad27d7594faeeb168391e64740912bac3458fb97e32ea075117a6ab46ae2802fac8c6f65381db3ecbe94f373d8c2fedc669a5ac7552e2f0bf2723e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-edgeorder) \
python311-azure-mgmt-edgeorder \
python3dist(azure-mgmt-edgeorder)"

RDEPENDS:${PN} += "python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
