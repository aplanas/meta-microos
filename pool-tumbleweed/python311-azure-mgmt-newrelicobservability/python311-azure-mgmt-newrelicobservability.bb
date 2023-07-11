SUMMARY = "Microsoft Azure Newrelicobservability Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Newrelicobservability Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-mgmt-newrelicobservability-1.0.0-1.2.noarch.rpm"
RPM_HASH = "7ba431a469363f106900bd02ef7ff96a13f1f531b5b9a5d982789e1a55b9bed5537aea6cac289b42a5b22efaa2dcc5153d4e31e1f428a82b19edddc17d6f0ab0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-newrelicobservability \
python3.11dist-azure-mgmt-newrelicobservability \
python311-azure-mgmt-newrelicobservability \
python3dist-azure-mgmt-newrelicobservability"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
