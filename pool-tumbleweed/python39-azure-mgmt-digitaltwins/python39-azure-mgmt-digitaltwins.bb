SUMMARY = "Microsoft Azure DigitalTwins Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Digitaltwins Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "6.4.0"

RPM_NAME = "python39-azure-mgmt-digitaltwins-6.4.0-1.3.noarch.rpm"
RPM_HASH = "b6fe13a6a06b32d272a1ce8e9e8922dd158a285d59b7989db79919c3d7696636c119a58b4a8a654882e42d7ca6eea22298b418bbb2eed1197bf934199d53f29b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-digitaltwins \
python39-azure-mgmt-digitaltwins \
python3dist-azure-mgmt-digitaltwins"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
