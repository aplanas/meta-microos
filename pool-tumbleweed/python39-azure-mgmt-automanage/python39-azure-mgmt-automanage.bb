SUMMARY = "Microsoft Azure Auto Manage Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Auto Manage Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python39-azure-mgmt-automanage-1.0.0.0-1.5.noarch.rpm"
RPM_HASH = "a595594272d4f42a29f159c631021cb43a4a38c7daa87e4834238c135acd4bf8e352bf8fe7f6392bead75cfaa48003abefedea1a73c9610d155a43fe5501477e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-automanage \
python39-azure-mgmt-automanage \
python3dist-azure-mgmt-automanage"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
