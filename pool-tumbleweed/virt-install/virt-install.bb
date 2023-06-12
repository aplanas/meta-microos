SUMMARY = "Utilities for installing virtual machines"
DESCRIPTION = "Package includes several command line utilities, including virt-install \
(build and install new VMs) and virt-clone (clone an existing virtual \
machine)."
LICENSE = "GPL-2.0-or-later"

PV = "4.1.0"

RPM_NAME = "virt-install-4.1.0-8.1.noarch.rpm"
RPM_HASH = "44b880812ba117bd7cad8f1341275217e635247f878e2cb921083c86a6c1700b7fdae35f645dc3e0b25f2fa3704642c29ece1fd110da53d01d98526ad5bcaf53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-virtinst \
virt-clone \
virt-install"
RDEPENDS:${PN} += "/usr/bin/python3 \
python3-requests \
virt-manager-common"

inherit rpm
