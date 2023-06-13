SUMMARY = "Microsoft Azure Agrifood Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Agrifood Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b3"

RPM_NAME = "python311-azure-mgmt-agrifood-1.0.0b3-1.3.noarch.rpm"
RPM_HASH = "21595e3bd7bcc2e3f41f05ffd8b0cf36137119151f515158d3e50135ec6d17e7600fb667faeddcb565cd5ab9999fad9378c71942f8609d5cbef1fc3dbc807f24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-agrifood) \
python311-azure-mgmt-agrifood \
python3dist(azure-mgmt-agrifood)"

RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) \
python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
