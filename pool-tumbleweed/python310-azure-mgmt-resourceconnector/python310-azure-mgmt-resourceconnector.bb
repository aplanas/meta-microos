SUMMARY = "Microsoft Azure Resourceconnector Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Resourceconnector Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python310-azure-mgmt-resourceconnector-1.0.0.0-1.1.noarch.rpm"
RPM_HASH = "6aaf4a3ed268d15766ab35eb17351371f00885053e98ab95a87abddb9cf2b94e6b56683e901c1c2cb9f885e01e3fdf75b69f944cdf8d8f1e7a29ea8a50d90f4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-resourceconnector \
python310-azure-mgmt-resourceconnector \
python3dist-azure-mgmt-resourceconnector"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
