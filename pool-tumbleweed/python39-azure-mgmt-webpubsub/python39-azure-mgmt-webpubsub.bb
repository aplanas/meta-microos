SUMMARY = "Microsoft Azure Webpubsub Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Webpubsub Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python39-azure-mgmt-webpubsub-1.1.0-1.3.noarch.rpm"
RPM_HASH = "10d0be62d55a8378f557403b59cf91e9f2d43467520f57fd438e4b2283942b49e29cd12d4af5a24f1a18e664e51972a47ef04de088232fdb4e39fa65eef69023"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-webpubsub \
python39-azure-mgmt-webpubsub \
python3dist-azure-mgmt-webpubsub"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
