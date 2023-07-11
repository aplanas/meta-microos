SUMMARY = "Microsoft Azure DataBox Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure DataBox Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python311-azure-mgmt-databox-2.0.0-1.2.noarch.rpm"
RPM_HASH = "fc0b58cbb79c2183ba55d0c113f5ba501bf2c8259b1438ad01d5e6889d10f48bbfa694ead480a48e5c4f85cbf58f8357b5e0430f88f3d839d7ff7fdb0858a1f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-databox \
python3.11dist-azure-mgmt-databox \
python311-azure-mgmt-databox \
python3dist-azure-mgmt-databox"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
