SUMMARY = "Microsoft Azure Connectedvmware Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Connectedvmware Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.0.0b3"

RPM_NAME = "python39-azure-mgmt-connectedvmware-1.0.0b3-1.3.noarch.rpm"
RPM_HASH = "96d8bbd58e014373df55265f117fb25988f906d5baca197848b7ebe14a318179376b1b9a03d822983ad359a4018c8ec552e034930ab86df3f9afae13b982137b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-connectedvmware \
python39-azure-mgmt-connectedvmware \
python3dist-azure-mgmt-connectedvmware"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
