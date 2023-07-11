SUMMARY = "Microsoft Azure DataBox Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure DataBox Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python39-azure-mgmt-databox-2.0.0-1.2.noarch.rpm"
RPM_HASH = "597d6642a268717125871248a09d9dde95cf41f4e22b769a65cb0154c3e5061524a4e27ac22624450d7ee0ca88b3a598bf0c4a4bea315373137a718fe1e50124"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-databox \
python39-azure-mgmt-databox \
python3dist-azure-mgmt-databox"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
