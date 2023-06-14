SUMMARY = "Microsoft Azure Selfhelp Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Selfhelp Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python310-azure-mgmt-selfhelp-1.0.0~b1-1.1.noarch.rpm"
RPM_HASH = "ba26b9ac49486287dd321d9e0213e036e1957a8b7dd7e6a32e61bbb94afcb55c61b4057d81dabe30639fdb3fd12ab09bb3a54d8552c0b557d9b39f95a6eb4a11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-selfhelp \
python3.10dist-azure-mgmt-selfhelp \
python310-azure-mgmt-selfhelp \
python3dist-azure-mgmt-selfhelp"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
