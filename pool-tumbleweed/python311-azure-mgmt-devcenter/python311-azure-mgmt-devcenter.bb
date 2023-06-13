SUMMARY = "Microsoft Azure Devcenter Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Devcenter Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python311-azure-mgmt-devcenter-1.0.0.0-1.1.noarch.rpm"
RPM_HASH = "ad2930ce6739b8778bbb6dcf9d5385b650c726ea41c429b8e46bfabdb740e4db4996e5cee417745cc885837de9d9f76f3acb97925a4666538022c170740fcd19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-devcenter) \
python311-azure-mgmt-devcenter \
python3dist(azure-mgmt-devcenter)"

RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) \
python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
