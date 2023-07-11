SUMMARY = "Microsoft Azure Resourceconnector Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Resourceconnector Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.0.0b4"

RPM_NAME = "python39-azure-mgmt-resourceconnector-1.0.0b4-1.2.noarch.rpm"
RPM_HASH = "37fb8a35e029a3b03360a41ca8e493df0d987e9f2f6322947d701714e9eef9f6b75d7151c16ec3ec9b0f0e2f013b5254731102aa17f4ba0dacba68408d0b31d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-resourceconnector \
python39-azure-mgmt-resourceconnector \
python3dist-azure-mgmt-resourceconnector"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
