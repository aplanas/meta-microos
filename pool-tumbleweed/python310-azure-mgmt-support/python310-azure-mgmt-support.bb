SUMMARY = "Microsoft Azure Support Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Support Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "6.0.0.0"

RPM_NAME = "python310-azure-mgmt-support-6.0.0.0-1.9.noarch.rpm"
RPM_HASH = "0adf5a55cc1f9139c895bb93464f3ba4a1cc5a77efd116065ea83e6a1992472ebf40ba89a23be9b8924d02c5feae7161011caf2aaee2143b72f54123238b50f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-support \
python310-azure-mgmt-support \
python3dist-azure-mgmt-support"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
