SUMMARY = "Parallel virsh command to manage a selected group of Virtual Machine"
DESCRIPTION = "Parallel virsh command to manage a selected group of Virtual Machine. \
This provides an easy way to execute the same command on a selected \
group of Virtual Machine."
LICENSE = "GPL-3.0-or-later"

PV = "2.2"

RPM_NAME = "python3-pvirsh-2.2-1.3.noarch.rpm"
RPM_HASH = "cfa2af46fc677dfbc1f4a9a7738603ee71798884a2af713a3320b8b76b54907fe615e7b18279faf5ff3b5b200f8e04a5e9e842638324e2030e5382f033b514cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-python3-pvirsh \
python3-pvirsh \
python3.11dist-pvirsh \
python3dist-pvirsh"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-PyYAML \
python3-curses \
python3-libvirt-python"

inherit rpm
