SUMMARY = "Microsoft Azure Selfhelp Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Selfhelp Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-mgmt-selfhelp-1.0.0-1.1.noarch.rpm"
RPM_HASH = "c5c0fe592a52b95ce9ca018e8e5dc771ea964dc8ca723975d93ca4a0b222cad78cf0bd481fe8d6af7eba3beb378828a3b8fccc9a76e81c9cd7edf403545a5be7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-selfhelp \
python39-azure-mgmt-selfhelp \
python3dist-azure-mgmt-selfhelp"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
