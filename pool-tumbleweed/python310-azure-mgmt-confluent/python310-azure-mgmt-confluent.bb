SUMMARY = "Microsoft Azure Confluent Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Confluent Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python310-azure-mgmt-confluent-1.0.0.0-1.10.noarch.rpm"
RPM_HASH = "4e4b64cd37676b677c4e6e90d5549b0a5209e1609d07afe80425c384d8609ebf30a8b16127663eb70fd838aab31819d3fc97a1eb3e5e0f9576ff60c2c6d941b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-confluent \
python3.10dist-azure-mgmt-confluent \
python310-azure-mgmt-confluent \
python3dist-azure-mgmt-confluent"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
