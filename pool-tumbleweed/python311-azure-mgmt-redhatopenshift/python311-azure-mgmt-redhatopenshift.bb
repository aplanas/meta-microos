SUMMARY = "Microsoft Azure Red Hat Openshift Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Red Hat Openshift Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python311-azure-mgmt-redhatopenshift-1.3.0-1.1.noarch.rpm"
RPM_HASH = "1ae1d6de42b0822d4bb6991532f3423b3dd2db74202bce51203c560b3390dfe474090d39737d9a46c7293a0e5b48007d917e492bc11b86f4104dbbf33b0f095c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-redhatopenshift \
python3.11dist-azure-mgmt-redhatopenshift \
python311-azure-mgmt-redhatopenshift \
python3dist-azure-mgmt-redhatopenshift"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
