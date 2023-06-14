SUMMARY = "Microsoft Azure Datadog Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Datadog Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python310-azure-mgmt-datadog-2.0.0-1.8.noarch.rpm"
RPM_HASH = "9d707dbb4f3dae4884a7d154abe39e9fc065026ee391c021916be56492f73a65c522a5c2b56840799590a310559eca9059fe2501d21cecf58f56e4f680b06076"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-datadog \
python3.10dist-azure-mgmt-datadog \
python310-azure-mgmt-datadog \
python3dist-azure-mgmt-datadog"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
