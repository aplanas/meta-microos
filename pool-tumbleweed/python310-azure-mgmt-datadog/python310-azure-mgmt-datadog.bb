SUMMARY = "Microsoft Azure Datadog Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Datadog Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python310-azure-mgmt-datadog-2.0.0-1.9.noarch.rpm"
RPM_HASH = "555f10f9eca2b54648f62cdd15685a56cf5860d4036f4331df75371ac2935988880f67a85fb6f10411e8b5a929397e224357dddb5ed61ac2b9cea2cd16e949ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-datadog \
python310-azure-mgmt-datadog \
python3dist-azure-mgmt-datadog"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
