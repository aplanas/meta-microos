SUMMARY = "Utilities for installing virtual machines"
DESCRIPTION = "Package includes several command line utilities, including virt-install \
(build and install new VMs) and virt-clone (clone an existing virtual \
machine)."
LICENSE = "GPL-2.0-or-later"

PV = "4.1.0"

RPM_NAME = "virt-install-4.1.0-9.1.noarch.rpm"
RPM_HASH = "1cbd6816bf64fa85fed9702897f968a72cf02a8be0bfeeff9ff0f1a9b549b8a061f2b440dc9e8728c9eafed377147ad1581dae8ffbddd5065659e93837087393"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-virtinst \
virt-clone \
virt-install"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3-requests \
virt-manager-common"

inherit rpm
