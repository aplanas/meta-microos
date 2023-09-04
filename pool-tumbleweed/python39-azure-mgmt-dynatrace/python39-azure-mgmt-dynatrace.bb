SUMMARY = "Microsoft Azure Dynatrace Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Dynatrace Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python39-azure-mgmt-dynatrace-2.0.0-1.1.noarch.rpm"
RPM_HASH = "301bafec33dda5ee70d47410cc87376d8dadfab5ebceddf090176300a8c970c76f45bd8fd6e2ab643e90afe717b558bec7ded40609949b9685f060ada3751de7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-dynatrace \
python39-azure-mgmt-dynatrace \
python3dist-azure-mgmt-dynatrace"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
