SUMMARY = "Microsoft Azure Guestconfig Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Guestconfig Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b2"

RPM_NAME = "python39-azure-mgmt-guestconfig-1.0.0b2-1.4.noarch.rpm"
RPM_HASH = "0f76c13dd95ddbce6ff966b72ca8e1e8b3a774df576663b6026fa31d6b66bd66d8a06ca7d4bc6a930ef2037b2ce654f8fdaf695d11eb3a12f81b6e30519e5fa7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-guestconfig \
python39-azure-mgmt-guestconfig \
python3dist-azure-mgmt-guestconfig"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
