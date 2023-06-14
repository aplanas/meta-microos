SUMMARY = "Avocado Runner for libvirt VM Execution"
DESCRIPTION = "This plugin allows Avocado to run jobs within a libvirt-based virtual machine, \
by means of interaction with a libvirt daemon and an SSH connection to the VM \
itself. Avocado must have been previously installed on the VM."
LICENSE = "GPL-2.0-only"

PV = "69.0"

RPM_NAME = "python3-avocado-plugins-runner-vm-69.0-6.10.noarch.rpm"
RPM_HASH = "2f2b23ea37277ab1396bdfff4157da7bafd039cc3470d8092c088cd571af7b106f49f0ccee0a2d87344b741fc3c05cc1cb4a735d05946c99c7610d02ee08624b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-avocado-plugins-runner-vm \
python3.10dist-avocado-framework-plugin-runner-vm \
python3dist-avocado-framework-plugin-runner-vm"

RDEPENDS:${PN} += "python-abi \
python3-avocado \
python3-avocado-plugins-runner-remote \
python3-libvirt-python"

inherit rpm
