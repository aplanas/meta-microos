SUMMARY = "Microsoft Azure MyService Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs \
that replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python39-azure-mgmt-maintenance-2.1.0-1.1.noarch.rpm"
RPM_HASH = "23b9e896f0b89b4be2d80cba6f2149fb2805e9162f5c0e827c6af675e2639c95a81943b783951ba7863a70e9e6daf3d1a498c9c3f185398203ff4703e7f08c18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-maintenance \
python39-azure-mgmt-maintenance \
python3dist-azure-mgmt-maintenance"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
