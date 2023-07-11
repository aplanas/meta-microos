SUMMARY = "Microsoft Azure MyService Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b1"

RPM_NAME = "python39-azure-mgmt-regionmove-1.0.0b1-2.12.noarch.rpm"
RPM_HASH = "3340e4b0f11519b110d9b474b05922f8161670d55bc00fb90eb6f98189721ad2ea60b6613b1aa2f4bd2fcb3e65cab4b46380e43b6352f93bb5d6d78ea67546ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-regionmove \
python39-azure-mgmt-regionmove \
python3dist-azure-mgmt-regionmove"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest \
python39-msrestazure"

inherit rpm
