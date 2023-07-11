SUMMARY = "Microsoft Azure Red Hat Openshift Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Red Hat Openshift Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python39-azure-mgmt-redhatopenshift-1.2.0-1.4.noarch.rpm"
RPM_HASH = "6ec6aa280d9baad84b7070c2ae8527e1dd2c4dbd0780c12a9a6ba65417cc666d3b88d1fcc79e6ff7e9b0b0e487f4d5e0d6240c4b336d34995306deaed3cadfc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-redhatopenshift \
python39-azure-mgmt-redhatopenshift \
python3dist-azure-mgmt-redhatopenshift"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
