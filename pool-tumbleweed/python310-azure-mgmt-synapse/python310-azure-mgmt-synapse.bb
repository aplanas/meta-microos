SUMMARY = "Microsoft Azure Synapse Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Synapse Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.1.0b5"

RPM_NAME = "python310-azure-mgmt-synapse-2.1.0b5-1.4.noarch.rpm"
RPM_HASH = "d2436f4ca87b8967580c6185a5ebfd6d4aef720248797371d5637c044d1a59d9cef6c396042604ac462843929127f74276225f3c08602afce3a9e12ee1948a60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-synapse \
python310-azure-mgmt-synapse \
python3dist-azure-mgmt-synapse"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
