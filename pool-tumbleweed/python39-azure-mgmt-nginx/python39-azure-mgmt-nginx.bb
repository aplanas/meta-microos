SUMMARY = "Microsoft Azure Nginx Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Nginx Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python39-azure-mgmt-nginx-2.1.0-1.3.noarch.rpm"
RPM_HASH = "01e565fcb94614ceca6f51cc71a14a3d062774d36804b6004179a3037f6cf36057d96f126a7622aa52fb5d336a8101b6266d827a86fb44012536cba7eaa5a06b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-nginx \
python39-azure-mgmt-nginx \
python3dist-azure-mgmt-nginx"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
