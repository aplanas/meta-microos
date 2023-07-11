SUMMARY = "Microsoft Azure Graphservices Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Graphservices Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-mgmt-graphservices-1.0.0-1.1.noarch.rpm"
RPM_HASH = "f25007a7f6318a677f30ce3810fcdc2bdefd9813d42e90c5d98581c56537ecdec2747c63fb7004a98e5896cd57470e0360e0cf7ef573f5880a2719fee1defffe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-graphservices \
python39-azure-mgmt-graphservices \
python3dist-azure-mgmt-graphservices"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
