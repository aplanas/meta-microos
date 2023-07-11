SUMMARY = "Microsoft Azure Service Management Legacy Client Library"
DESCRIPTION = "This is the Microsoft Azure Service Management Legacy Client Library. \
 \
All packages in this bundle have been tested with Python 2.7, 3.3, 3.4 and 3.5."
LICENSE = "Apache-2.0"

PV = "0.20.7"

RPM_NAME = "python39-azure-servicemanagement-legacy-0.20.7-2.12.noarch.rpm"
RPM_HASH = "ba5a9d6dc4a8dfffe6e96b677dcd84b56aa0e841ca8f4dce2de77f215778f67e787b4510c5d9ba07bb3ed77963657fd674a73e88e8d2c16ef6ea0d896ca45f90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-servicemanagement-legacy \
python39-azure-servicemanagement-legacy \
python3dist-azure-servicemanagement-legacy"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-nspkg \
python39-requests"

inherit rpm
