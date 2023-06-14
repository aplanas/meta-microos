SUMMARY = "Microsoft Azure Service Management Legacy Client Library"
DESCRIPTION = "This is the Microsoft Azure Service Management Legacy Client Library. \
 \
All packages in this bundle have been tested with Python 2.7, 3.3, 3.4 and 3.5."
LICENSE = "Apache-2.0"

PV = "0.20.7"

RPM_NAME = "python311-azure-servicemanagement-legacy-0.20.7-2.11.noarch.rpm"
RPM_HASH = "09e02c45de47671eaa98523d936aa9886c68f2ffdf1eda73dd552b59c9634c03c22d57ee755d4eec8a7a32977dc4e02e9a589651d49c42b9168cac8a4c8a0e5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-servicemanagement-legacy \
python311-azure-servicemanagement-legacy \
python3dist-azure-servicemanagement-legacy"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-nspkg \
python311-requests"

inherit rpm
