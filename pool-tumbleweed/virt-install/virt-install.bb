SUMMARY = "Utilities for installing virtual machines"
DESCRIPTION = "Package includes several command line utilities, including virt-install \
(build and install new VMs) and virt-clone (clone an existing virtual \
machine)."
LICENSE = "GPL-2.0-or-later"

PV = "4.1.0"

RPM_NAME = "virt-install-4.1.0-10.1.noarch.rpm"
RPM_HASH = "a2a23dabe750b072d1d5112eff91e466a04b460967bd0efbf6de1daae0c50c7e35af769d709b31db4a29694f6db768b471d4fdc0b1035ae33898fda6871c83ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-virtinst \
virt-clone \
virt-install"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3-requests \
virt-manager-common"

inherit rpm
