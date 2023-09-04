SUMMARY = "Microsoft Azure Red Hat Openshift Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Red Hat Openshift Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python310-azure-mgmt-redhatopenshift-1.3.0-1.1.noarch.rpm"
RPM_HASH = "4d1d0d2006b96b4788786fad3bda9682cdd575ba5658311304b7b0ead5488588e77b087f1161f7244e55be4c839c01f5ee5aaac5cb2abef7cd638f03d09f777e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-redhatopenshift \
python310-azure-mgmt-redhatopenshift \
python3dist-azure-mgmt-redhatopenshift"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
