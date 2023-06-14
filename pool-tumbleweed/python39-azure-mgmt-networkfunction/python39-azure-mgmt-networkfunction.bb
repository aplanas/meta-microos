SUMMARY = "Microsoft Azure Networkfunction Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Networkfunction Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python39-azure-mgmt-networkfunction-1.0.0~b1-1.3.noarch.rpm"
RPM_HASH = "8aa23d274851e96bf04342fb3160949c72c4b132c30d8d75714d0079ca6d2f50c7e42248e2e74f7935ed08eb5b88aac283212ea4c9d2ea51d633ce7000aa087b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-networkfunction \
python39-azure-mgmt-networkfunction \
python3dist-azure-mgmt-networkfunction"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
