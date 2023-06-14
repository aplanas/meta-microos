SUMMARY = "Microsoft Azure Red Hat Openshift Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Red Hat Openshift Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python311-azure-mgmt-redhatopenshift-1.2.0-1.3.noarch.rpm"
RPM_HASH = "3174580566c7ad99563336cd7a1a9dac15d4f3f7545aefdc3cfd040b9b8973fdcdf2108ba06ec81b9e13d2895526d89324cd9679955143f2ccc2cb719d108ba2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-mgmt-redhatopenshift \
python311-azure-mgmt-redhatopenshift \
python3dist-azure-mgmt-redhatopenshift"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
