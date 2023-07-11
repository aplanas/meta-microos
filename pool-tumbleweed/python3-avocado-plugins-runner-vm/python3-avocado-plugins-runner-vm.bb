SUMMARY = "Avocado Runner for libvirt VM Execution"
DESCRIPTION = "This plugin allows Avocado to run jobs within a libvirt-based virtual machine, \
by means of interaction with a libvirt daemon and an SSH connection to the VM \
itself. Avocado must have been previously installed on the VM."
LICENSE = "GPL-2.0-only"

PV = "69.0"

RPM_NAME = "python3-avocado-plugins-runner-vm-69.0-6.11.noarch.rpm"
RPM_HASH = "cecc56ed60c1f37d079db4c4ffcdbf1e26e31361d699aba7e04969a3e2fd04164013ec058d4cba7967c7c3e9e17998d90be23474febf525065cc1f2af0770719"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-avocado-plugins-runner-vm \
python3.11dist-avocado-framework-plugin-runner-vm \
python3dist-avocado-framework-plugin-runner-vm"

RDEPENDS:${PN} += "python-abi \
python3-avocado \
python3-avocado-plugins-runner-remote \
python3-libvirt-python"

inherit rpm
