SUMMARY = "Microsoft Azure Edgeorder Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Edgeorder Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python39-azure-mgmt-edgeorder-1.0.0.0-1.7.noarch.rpm"
RPM_HASH = "b7407c7e0aa2157ead1a597781e5b001e5cea26c7051caab5affb2a83d280f838111a020194f8e14e674b0f02699d79fbc7d7e1afecb82370fe1824590c1f602"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-edgeorder \
python39-azure-mgmt-edgeorder \
python3dist-azure-mgmt-edgeorder"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
