SUMMARY = "Microsoft Azure Webpubsub Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Webpubsub Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python310-azure-mgmt-webpubsub-1.1.0-1.3.noarch.rpm"
RPM_HASH = "b472dcf45f841f0441d607f0f57161638f369632de76fc26f4bcdd6813422f02c367966c3cde80d0f2241380bdabf7b26c8cf015061fb4170429bf45985831e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-webpubsub \
python310-azure-mgmt-webpubsub \
python3dist-azure-mgmt-webpubsub"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
