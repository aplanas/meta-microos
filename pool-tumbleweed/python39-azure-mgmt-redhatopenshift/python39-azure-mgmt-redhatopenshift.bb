SUMMARY = "Microsoft Azure Red Hat Openshift Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Red Hat Openshift Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python39-azure-mgmt-redhatopenshift-1.3.0-1.1.noarch.rpm"
RPM_HASH = "9aed1ef4d37a44873254045a89df208df955977772cf1998067913fa593d72cecdd1d0139f852eb1b13e30760fe7d0d2967428ef5f15cfcae3e3ca1d54d200f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-redhatopenshift \
python39-azure-mgmt-redhatopenshift \
python3dist-azure-mgmt-redhatopenshift"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
